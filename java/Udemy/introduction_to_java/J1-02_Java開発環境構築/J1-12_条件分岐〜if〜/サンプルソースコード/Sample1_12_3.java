class Sample1_12_3 {
	public static void main (String[] args) {
		
		//if-else�̂�����
		
		int customerAge = Integer.parseInt(args[0]) ;  //�ڋq�̔N��
		
		if( customerAge < 12 ){
			
			System.out.println("�u�������񂩂��ꂳ��́H�v");
			
		}else if( customerAge < 20 ){
			
			System.out.println("�u�����N�̕��ɂ����͔���܂���v");
			
		}else{
			
			System.out.println("�u����v220�~�ɂȂ�܂��v");
			
		}
	}
}

