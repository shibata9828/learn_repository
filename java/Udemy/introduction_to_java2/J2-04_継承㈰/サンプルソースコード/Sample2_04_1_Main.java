class Sample2_04_1_Main {
	public static void main (String[] args) {
		
		//�V�i���I�@�F�Ԃ���ɓo�ꂳ����iSample2_01_1_car�N���X�̃C���X�^���X���j
		
		Sample2_04_1_Moco moco = new Sample2_04_1_Moco();
		
		
		//�V�i���I�A�F�uSample2_04_1_Moco�v�N���X�̃����o�̎g�p
		System.out.println("���V�i���I�A�F�uSample2_04_1_Moco�v�N���X�̃����o�̎g�p-----------------") ;
		
		System.out.println( moco.name ) ;
		moco.cuteStretch() ;
		
		
		//�V�i���I�A�F�uSample2_04_1_Dog�v�N���X�̃����o�̎g�p
		System.out.println("���V�i���I�B�F�uSample2_04_1_Dog�v�N���X�̃����o�̎g�p------------------") ;
		
		System.out.println( moco.type ) ;
		moco.bark() ;
		
		
		//�V�i���I�A�F�uSample2_04_1_Mammals�v�N���X�̃����o�̎g�p
		System.out.println("���V�i���I�C�F�uSample2_04_1_Mammals�v�N���X�̃����o�̎g�p--------------") ;
		
		System.out.println( moco.group ) ;
		moco.breatheLungs() ;
		
		
	}
}

