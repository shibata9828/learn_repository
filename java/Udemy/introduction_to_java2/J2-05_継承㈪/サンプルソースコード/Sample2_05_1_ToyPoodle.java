class Sample2_05_1_ToyPoodle extends Sample2_05_1_Dog {
	
	//---�t�B�[���h-------------------------------------
	
	String name  ; //���O
	String skill ; //���Z
	
	//---�R���X�g���N�^---------------------------------
	
	Sample2_05_1_ToyPoodle(){
		this.name  = "���ݒ�iname�j" ;
		this.skill = "���ݒ�iskill�j" ;
	}
	
	Sample2_05_1_ToyPoodle(String v){
		super( v );
		this.name  = "���ݒ�iname�j" ;
		this.skill = "���ݒ�iskill�j" ;
	}
	
	Sample2_05_1_ToyPoodle(String n , String s , String v){
		super( v );
		this.name  = n ;
		this.skill = s ;
	}
	
	//---���\�b�h---------------------------------------
	
	//���Z�����s
	void doSkill(){
		System.out.println( skill ) ;
	}
}
