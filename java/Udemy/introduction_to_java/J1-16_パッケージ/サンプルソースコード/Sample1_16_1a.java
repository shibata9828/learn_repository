import java.util.Calendar;     //API����Calendar�N���X���C���|�[�g
import sample.Sample1_16_1c;   //�O���̃p�b�P�[�Wsample����instanceSampleC�N���X���C���|�[�g�iCLASSPATH�̐ݒ肪�K�v�j

public class Sample1_16_1a {
	public static void main (String[] args) {
		
		//Calendar�N���X�iAPI�j���C���X�^���X���i�C���X�^���X���FinstanceCal�j
		Calendar instanceCal      = Calendar.getInstance();
		
		//Sample1_16_1b�N���X�i�����p�b�P�[�W�j���C���X�^���X���i�C���X�^���X���FinstanceSampleB�j
		Sample1_16_1b instanceSampleB = new Sample1_16_1b();
		
		//Sample1_16_1c�N���X�i�O���̃p�b�P�[�W�j���C���X�^���X���i�C���X�^���X���FinstanceSampleC�j
		Sample1_16_1c instanceSampleC = new Sample1_16_1c();
		
		/*
		//���C���X�^���XinstanceCal���猻�݂̌����Ɋւ�������擾���ĉ�ʕ\������
		//  - instanceCal.get( Calendar.MONTH ) �c �C���X�^���XinstanceCal��茻�݂̌��Ɋւ���l�����擾���܂�
		//      �����̒l��1��=0,2��=1,�c,12��=11�i0����J�E���g�j�Œl��Ԃ��܂�
		//  - instanceCal.get( Calendar.DATE )  �c �C���X�^���XinstanceCal��茻�݂̓��Ɋւ���l�����擾���܂�
		//      �����̒l��1��=1,2��=2,�c�i1����J�E���g�j�Œl��Ԃ��܂�
		//  - instanceSampleB.realMonth( �` )   �c �����Ɂ{�P�����l��Ԃ��܂�
		//  - instanceSampleC.makeMessage(�Z,��)    �c ������u�����́Z�������ł��v��Ԃ��܂�
		*/
		int month = instanceSampleB.realMonth( instanceCal.get( Calendar.MONTH ) );     //���݂̌��̒l���擾
		
		int date  = instanceCal.get( Calendar.DATE );                                   //���݂̓��̒l���擾
		
		System.out.println( instanceSampleC.makeMessage( month , date ) );               //��ʂɁu�����́Z�������ł��v�ƕ\��
	}
}

