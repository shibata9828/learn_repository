class Sample2_06_1_Dog {
	
	//---�萔-------------------------------------------
	public static final String SCIENTIFIC_NAME = "Canis lupus familiaris" ; //�w���F�J�j�X�E���v�X�E�t�@�~���A�[���X
	
	//---�t�B�[���h-------------------------------------
	private static int    dogsNumber = 0 ; //���̑S�����i�����l�F0�j
	private static String breed ;          //����
	private        String name  ;          //���O
	
	//---�R���X�g���N�^---------------------------------
	Sample2_06_1_Dog(String br , String nm){
		this.dogsNumber++ ;  //�C���X�^���X������邽�т�dogsNumber�̒l���{�P����
		this.breed = br ;
		this.name  = nm ;
	}
	
	//---���\�b�h---------------------------------------
	//getStatus���\�b�h
	public String getStatus(){
		return "���̑S����:" + this.dogsNumber + " / ���O:" + this.name + " / ����:" + this.breed ;
	}
	
	//getter�idogsNumber�j
	public static int getDogNumber(){
		return dogsNumber ;
	}
}
