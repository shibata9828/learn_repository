class Sample1_11_2 {
	public static void main (String[] args) {
		
		//do-while���̂�����
		
		/*�R�}���h���C�������Ŏ󂯎���������̗ݏ�̐��̂����A100�����̂��݂̂̂�\������v���O���������B
		**�y��z�R�}���h���C�������ł̓��́F3 �� �\������鐔�F3 , 9 , 27 , 81
		*/
		
		int receiveNumber = Integer.parseInt(args[0]) ;  //���[�v����calcNumber�Ɋ|���鐔�i�R�}���h���C�������Ŏ󂯎�����l�j
		int calcNumber    = receiveNumber ;              //�\�����鐔�i�����l�F�R�}���h���C�������Ŏ󂯎�����l�j
		
		do{
			
			System.out.println("calcNumber�F" + calcNumber);
			
			calcNumber *= receiveNumber ;
			
		}while( calcNumber < 100 );
		
	}
}
