class Sample2_05_1_Main {
	public static void main (String[] args) {
		
		//�V�i���I�@�F�Ԃ���ɓo�ꂳ����iSample2_01_1_car�N���X�̃C���X�^���X���j
		
		Sample2_05_1_ToyPoodle toyPoo1 = new Sample2_05_1_ToyPoodle();
		Sample2_05_1_ToyPoodle toyPoo2 = new Sample2_05_1_ToyPoodle("�L�����L����");
		Sample2_05_1_ToyPoodle moco    = new Sample2_05_1_ToyPoodle("MOCO" , "���킢���X�g���b�`�I" , "�q�����q����");
		
		
		//�V�i���I�A�F�utoyPoo1�v�C���X�^���X�̊m�F
		System.out.println("���V�i���I�A�F�utoyPoo1�v�C���X�^���X�̊m�F-----------------") ;
		System.out.println( toyPoo1.name ) ;
		toyPoo1.bark() ;
		toyPoo1.doSkill() ;
		
		//�V�i���I�B�F�utoyPoo2�v�C���X�^���X�̊m�F
		System.out.println("���V�i���I�B�F�utoyPoo2�v�C���X�^���X�̊m�F-----------------") ;
		System.out.println( toyPoo2.name ) ;
		toyPoo2.bark() ;
		toyPoo2.doSkill() ;
		
		//�V�i���I�C�F�umoco�v�C���X�^���X�̊m�F
		System.out.println("���V�i���I�C�F�umoco�v�C���X�^���X�̊m�F--------------------") ;
		System.out.println( moco.name ) ;
		moco.bark() ;
		moco.doSkill() ;
		
	}
}

