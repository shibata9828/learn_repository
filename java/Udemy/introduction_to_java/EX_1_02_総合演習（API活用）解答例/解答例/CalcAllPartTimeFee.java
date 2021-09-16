import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

class CalcAllPartTimeFee {
	
	public static void main(String[] args) {

		//------------�萔�̒�`------------
		final String COMMA = "," ; //�R���}
		
		//----------------------------------------------------------------------------
		//�uWorkingResult.csv�v����1�����̋Ζ����т�ǂݍ��݁A�Ζ����у��X�g���쐬
		//----------------------------------------------------------------------------
		
		List<String> workingResults = new ArrayList<String>();   //�Ζ����у��X�g
		
		try {
			File file = new File("C:\\WorkSpace\\WorkingResult.csv");       //�uC:\WorkSpace�v�����ɁuWorkingResult.csv�v���i�[
			BufferedReader br = new BufferedReader(new FileReader(file));

			//�uWorkingResult.csv�v����1�s���ǂݍ��݁A�Ζ����у��X�g���쐬
			String recode = br.readLine();
			while (recode != null) {
				workingResults.add(recode);
				recode = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		//----------------------------------------------------------------------------
		//�Ζ����у��X�g���獡���̋��^���Z�o�A���ʂ���ʂɕ\��
		//----------------------------------------------------------------------------
		
		int partTimeFeeByMonth = 0 ; //�����̋��^
		
		//�Ζ����у��X�g����1���������^���v�Z���A�����̋��^���W�v
		for (int i = 0; i < workingResults.size(); i++) {
			
			//�Ζ����у��X�g����1�����̃f�[�^�����o��
			String   workingRecordSt = workingResults.get(i);
			
			//�J���}��؂�Ńf�[�^�𕪊����A�z��Ƃ��čĒ�`
			//�iworkingRecordAr[0]�F�o�Γ��AworkingRecordAr[1]�F�o�Ύ��ԁAworkingRecordAr[2]�F�ދΎ��ԁj
			String[] workingRecordAr = workingRecordSt.split(COMMA);
			
			//�o�Ύ��ԂƑދΎ��Ԃ������Ƃ���calcPartTimeFeeByTheDay���N���B
			//�߂�l�Ƃ��ē���ꂽ�l�i1��������̋��^�j�������̋��^�ɍ��Z�B
			partTimeFeeByMonth += calcPartTimeFeeByTheDay( workingRecordAr[1] , workingRecordAr[2] ) ;
			
		}
		
		//���ʂ���ʂɕ\��
		System.out.println("�����̋��^�́A" + partTimeFeeByMonth + "�~�ł��B");
		
	}
	
	
	/*�ycalcPartTimeFeeByTheDay���\�b�h�z
	**  �o�Ύ��ԂƑދΎ��Ԃ���1�����̋��^���Z�o���ĕԂ�
	*/
	public static int calcPartTimeFeeByTheDay( String st , String ed ) {
		
		//------------�萔�̒�`------------
		final int    HOURLY_SALARY            = 900                          ; //����
		final int    MINUTES_SALARY           = HOURLY_SALARY / 60           ; //�����i�����_�ȉ��؂�̂āj
		final int    CONV_HOUR_TO_MILLISEC    = 1000 * 60 * 60               ; //���Ԃ̃~���b���Z
		final int    CONV_MINUTE_TO_MILLISEC  = 1000 * 60                    ; //���̃~���b���Z
		final int    CONV_HOUR_TO_MINUTE      = 60                           ; //���Ԃ̕����Z
		final long   WORK_TIME_TYPE1_END      = 6  * CONV_HOUR_TO_MILLISEC   ; //�J�����ԃ^�C�v�@�i�~���b�j�i�J�����ԁ`6���Ԉȉ��j - �I������
		final long   WORK_TIME_TYPE2_START    = 6  * CONV_HOUR_TO_MILLISEC   ; //�J�����ԃ^�C�v�A�i�~���b�j�i�J������6���Ԓ��`8���Ԉȉ��j - �J�n����
		final long   WORK_TIME_TYPE2_END      = 8  * CONV_HOUR_TO_MILLISEC   ; //�J�����ԃ^�C�v�A�i�~���b�j�i�J������6���Ԓ��`8���Ԉȉ��j - �I������
		final long   WORK_TIME_TYPE3_START    = 8  * CONV_HOUR_TO_MILLISEC   ; //�J�����ԃ^�C�v�B�i�~���b�j�i�J������8���Ԓ��`�j - �J�n����
		final long   REST_TIME_TYPE1          = 45 * CONV_MINUTE_TO_MILLISEC ; //�x�e���ԁi�~���b�j���J�����ԃ^�C�v�A�ɓK�p
		final long   REST_TIME_TYPE2          = 60 * CONV_MINUTE_TO_MILLISEC ; //�x�e���ԁi�~���b�j���J�����ԃ^�C�v�B�ɓK�p
		final double OVERTIME_SALARY_RATE     = 1.25                         ; //�c�Ƒ�{�� �������J�����Ԃ�8���Ԃ𒴂����ꍇ�ɓK�p
		final int    ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN = 8  * CONV_HOUR_TO_MINUTE ; //�c�Ƃ�����������J�����ԁi���j�i���J������8���ԁj
		
		//------------�ϐ��̒�`------------
		Time startTime            = Time.valueOf( st )                         ; //�o�Ύ���
		Time finishTime           = Time.valueOf( ed )                         ; //�ދΎ���
		long workTime             = finishTime.getTime() - startTime.getTime() ; //�J�����ԁi�~���b�j
		int  actualWorkTimeMin    = 0                                          ; //���J�����ԁi���j���x�e���Ԃ������������J������
		int  partTimeFee          = 0                                          ; //���^
		
		
		//----------------------------------------------------------------------------
		//���J�����Ԃ̌v�Z
		//----------------------------------------------------------------------------
		
		if (workTime <= WORK_TIME_TYPE1_END) {
			//�J�����ԃ^�C�v�@�i�J�����ԁ`6���Ԉȉ��j�̏ꍇ
			
			//���J�����ԁi���j�̌v�Z
			actualWorkTimeMin = (int)( workTime / CONV_MINUTE_TO_MILLISEC ) ;
			
		} else if (workTime > WORK_TIME_TYPE2_START && workTime <= WORK_TIME_TYPE2_END) {
			//�J�����ԃ^�C�v�A�i�J������6���Ԓ��`8���Ԉȉ��j�̏ꍇ
			
			//���J�����ԁi���j�̌v�Z
			actualWorkTimeMin = (int)( (  workTime - REST_TIME_TYPE1 ) / CONV_MINUTE_TO_MILLISEC ) ;
			
		} else if (workTime > WORK_TIME_TYPE3_START){
			//�J�����ԃ^�C�v�B�i�J������8���Ԓ��`�j
			
			//���J�����ԁi���j�̌v�Z
			actualWorkTimeMin = (int)( ( workTime - REST_TIME_TYPE2 ) / CONV_MINUTE_TO_MILLISEC ) ;
			
		}
		
		
		//----------------------------------------------------------------------------
		//1��������̋��^�̌v�Z ��1�~�ȉ��͐؂�̂�
		//----------------------------------------------------------------------------
		
		if( actualWorkTimeMin > ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN ){
			//�c�Ƒオ��������i���J�����ԁi���j��8���Ԃ𒴂���j�ꍇ
			
			partTimeFee = ( MINUTES_SALARY * ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN )
			              + (int)( MINUTES_SALARY * OVERTIME_SALARY_RATE * ( actualWorkTimeMin - ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN ) ) ;
			
		}else{
			//�c�Ƒオ�������Ȃ��ꍇ
			
			partTimeFee = MINUTES_SALARY * actualWorkTimeMin ;
		}
		
		
		//----------------------------------------------------------------------------
		//�߂�l�Ƃ���1��������̋��^��Ԃ�
		//----------------------------------------------------------------------------
		
		return partTimeFee ;
	}
}
