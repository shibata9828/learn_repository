/*-< ���K�FEx1_12_2 >---------------------------------
�ȉ��͈ȑO�ɍu���ň����� Sample1_11_1.java �Ɠ������e�̏����ł��B
���̃v���O������ 0 �� 1 �Ȃǂ��R�}���h���C�������Ŏ󂯎��Ɩ������[�v�Ɋׂ��Ă��܂��܂��B
���̑΍�Ƃ���receiveNumber���ȉ���NG�p�^�[���ɊY������ꍇ��while�������s�����A�����
�u�K�؂Ȓl����͂��Ă��������v�Ƃ������b�Z�[�W��\������v���O�����ɏ��������Ă��������B

 [receiveNumber��NG�p�^�[��]
  |_ receiveNumber�̒l���}�C�i�X
  |_ receiveNumber�̒l��0
  |_ receiveNumber�̒l��1

----------------------------------------------------*/
class Ex1_12_2 {
	public static void main (String[] args) {
		
		/*�R�}���h���C�������Ŏ󂯎���������̗ݏ�̐��̂����A100�����̂��݂̂̂�\������v���O���������B
		**�y��z�R�}���h���C�������ł̓��́F3 �� �\������鐔�F3 , 9 , 27 , 81
		*/
		
		int receiveNumber = Integer.parseInt(args[0]) ;  //���[�v����calcNumber�Ɋ|���鐔�i�R�}���h���C�������Ŏ󂯎�����l�j
		int calcNumber    = receiveNumber ;              //�\�����鐔�i�����l�F�R�}���h���C�������Ŏ󂯎�����l�j
		
		if( receiveNumber < 0 || receiveNumber == 0 || receiveNumber == 1 ){  //receiveNumber��NG�p�^�[���ɊY������ꍇ
			
			System.out.println(" �u�K�؂Ȓl����͂��Ă��������v ");
			
		}else{
			
			while( calcNumber < 100 ){                   //100�����̂��݂̂̂�\������
			
				System.out.println("calcNumber�F" + calcNumber);
			
				calcNumber *= receiveNumber ;            //�����Ŏ󂯎���������̗ݏ�̐�
			
			}
		}
	}
}
