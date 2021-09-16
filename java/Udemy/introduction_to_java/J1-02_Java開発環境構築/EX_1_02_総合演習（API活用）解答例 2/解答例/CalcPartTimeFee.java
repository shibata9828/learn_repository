import java.sql.Time;

public class CalcPartTimeFee {
	public static void main(String[] args) {
		
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
		Time startTime            = Time.valueOf(args[0])                      ; //�o�Ύ���
		Time finishTime           = Time.valueOf(args[1])                      ; //�ދΎ���
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
		//���b�Z�[�W�̕\��
		//----------------------------------------------------------------------------
		
		System.out.println("�{���̋��^��" + partTimeFee + "�~�ł�");
	}
}
