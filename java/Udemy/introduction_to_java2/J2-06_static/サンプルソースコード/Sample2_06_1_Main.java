class Sample2_06_1_Main {
	public static void main (String[] args) {
		
		//�V�i���I�@�FSample2_06_1_Dog�N���X��static�����o�ɃA�N�Z�X�ł��邱�Ƃ��m�F
		System.out.println("���V�i���I�@�FSample2_06_1_Dog�N���X��static�����o�ɃA�N�Z�X�ł��邱�Ƃ��m�F") ;
		System.out.println( Sample2_06_1_Dog.SCIENTIFIC_NAME ) ;
		System.out.println( Sample2_06_1_Dog.getDogNumber() ) ;
		
		//�V�i���I�A�FSample2_06_1_Dog���C���X�^���X��&�t�B�[���h�̊m�F
		System.out.println("���V�i���I�A�FSample2_06_1_Dog���C���X�^���X��&�t�B�[���h�̊m�F") ;
		
		System.out.println("��1�̖ځ�-----------------") ;
		Sample2_06_1_Dog moco  = new Sample2_06_1_Dog("ToyPoodle"      ,"MOCO" );
		System.out.println( moco.getStatus() ) ;
		
		System.out.println("��2�̖ځ�-----------------") ;
		Sample2_06_1_Dog choco = new Sample2_06_1_Dog("WelshCorgi"     ,"CHOCO");
		System.out.println( moco.getStatus() ) ;
		System.out.println( choco.getStatus() ) ;
		
		System.out.println("��3�̖ځ�-----------------") ;
		Sample2_06_1_Dog pochi = new Sample2_06_1_Dog("GoldenRetriever","POCHI");
		System.out.println( moco.getStatus() ) ;
		System.out.println( choco.getStatus() ) ;
		System.out.println( pochi.getStatus() ) ;
		
		//�V�i���I�B�F�e�I�u�W�F�N�g����static�����o�ւ̃A�N�Z�X�̊m�F
		System.out.println("���V�i���I�B�F�e�I�u�W�F�N�g����static�����o�ւ̃A�N�Z�X�̊m�F") ;
		
		System.out.println("���N���X�I�u�W�F�N�g����̃A�N�Z�X��");
		System.out.println( Sample2_06_1_Dog.SCIENTIFIC_NAME ) ;
		System.out.println( Sample2_06_1_Dog.getDogNumber() ) ;
		
		System.out.println("���C���X�^���X�I�u�W�F�N�g����̃A�N�Z�X��");
		System.out.println( moco.SCIENTIFIC_NAME ) ;
		System.out.println( moco.getDogNumber() ) ;
		
		
		
	}
}

