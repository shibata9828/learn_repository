class Sample1_10_1 {
	public static void main (String[] args) {
		
		//for���̂�����
		
		int loopCount = 0 ; //����ڂ̃��[�v����\�����l�i�����l0�j
		
		System.out.println("��[�J�n]for��");
		
		for( int i = 0 ; i < 4 ; i++ ){
			System.out.println("  ��[�J�n]1�񕪂̌J��Ԃ�����");
			
			//loopCount��1�グ��
			loopCount += 1 ;  
			
			//loopCount����уJ�E���^�ϐ�i�̕\��
			System.out.println("    loopCount�F" + loopCount);
			System.out.println("    i�i�J�E���^�ϐ��j�F" + i);
			
			System.out.println("  ��[�I��]1�񕪂̌J��Ԃ�����");
		}
		
		System.out.println("��[�I��]for��");
		
	}
}
