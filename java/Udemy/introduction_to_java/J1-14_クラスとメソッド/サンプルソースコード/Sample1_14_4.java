class Sample1_14_4 {
	
	public static void main( String[] args ) {
		
		//���[�J���ϐ��̂�����
		
		String message = "�s���ł�" ;
		
		int print = 0 ;
		
		if( args.length == 2 ){
			
			int num1 = Integer.parseInt( args[0] );           //���X�R�[�v���ʂł���Ζ��O�������ϐ����`���邱�Ƃ͉\�ł�
			int num2 = Integer.parseInt( args[1] );           //���X�R�[�v���ʂł���Ζ��O�������ϐ����`���邱�Ƃ͉\�ł�
			
			print = sum( num1 , num2 );
			
		}else{
			System.out.println( message );
		}
		
		System.out.println( "print�F" + print );              //���i�G���[�j�X�R�[�v�O����̃A�N�Z�X�͂ł��܂���i�l�X�g�ɂȂ��Ă���u���b�N���̕ϐ��j
		
	}
	
	static int sum( int num1 , int num2 ) {
		
		int print = 0 ;
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
}

