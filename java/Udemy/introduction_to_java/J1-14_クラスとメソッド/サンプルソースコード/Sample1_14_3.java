class Sample1_14_3 {
	
	public static void main(String[] args) {
		
		//�I�[�o�[���[�h�̂�����
		
		//sum���\�b�h�iint�^�̈���2�j�̌Ăяo��
		int print1 = sum( 2 , 3 ) ;
		System.out.println("print1�F" + print1);
		
		//sum���\�b�h�idouble�^�̈���2�j�̌Ăяo��
		double print2 = sum( 1.2 , 1.3 ) ;
		System.out.println("print2�F" + print2);
		
		//sum���\�b�h�iint�^�̈���3�j�̌Ăяo��
		int print3 = sum( 2 , 3 , 4 ) ;
		System.out.println("print3�F" + print3);
		
	}
	
	//sum�iint�^�̈���2�j
	static int sum( int num1 , int num2 ) {
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
	//sum���\�b�h�idouble�^�̈���2�j
	static double sum( double num1 , double num2 ) {
		
		double calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
	//sum�iint�^�̈���3�j
	static int sum( int num1 , int num2 , int num3 ) {
		
		int calcResult = num1 + num2 + num3 ;
		
		return calcResult ;
		
	}
	
}
