class Sample1_14_2 {
	
	//�������s�v�ȃ��\�b�h
	static String getName() {
		
		return "���R" ;
		
	}
	
	//�߂�l�Ȃ��̃��\�b�h
	static void printName(String name) {
		
		System.out.println("�Ȃ܂��F" + name);
		
	}
	
	//�v���O�����͕K��main���\�b�h����͂��܂�
	public static void main(String[] args) {
		
		String print = getName() ;
		
		printName( print );
		
	}
	
}
