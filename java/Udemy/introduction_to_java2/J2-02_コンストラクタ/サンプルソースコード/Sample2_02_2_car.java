class Sample2_02_2_car {
	
	//---�t�B�[���h�i�N���X�����Œ�`���ꂽ�ϐ��j----------------
	
	String  carModel ;  //�Ԏ햼
	String  owner    ;  //�I�[�i�[
	String  color    ;  //�h���F
	int     speed    ;  //���݂̑��x
	boolean right    ;  //���C�g�itrue:�_��/false:�����j
	
	//---�R���X�g���N�^------------------------------------------------
	
	//�R���X�g���N�^�@�i�����Ȃ��j
	Sample2_02_2_car(){
		System.out.println("�@�@���R���X�g���N�^�@�i�����Ȃ��j-------------------------") ;
		carModel = "���o�^" ;  //�Ԏ햼
		owner    = "���o�^" ;  //�I�[�i�[
		color    = "���o�^" ;  //�h���F
		speed    = 0        ;  //���݂̑��x
		right    = false    ;  //���C�g�itrue:�_��/false:�����j
		System.out.println("�@�@��-----------------------------------------------------") ;
	}
	
	//�R���X�g���N�^�A�i��������j
	Sample2_02_2_car(String carModel , String owner , String color , int speed , boolean right ){
		this();                    //�R���X�g���N�^�@�i�����Ȃ��j�̋N��
		System.out.println("�@�@���R���X�g���N�^�A�i��������j-------------------------") ;
		this.carModel = carModel ;  //�Ԏ햼
		owner         = owner    ;  //�I�[�i�[
		color         = color    ;  //�h���F
		speed         = speed    ;  //���݂̑��x
		right         = right    ;  //���C�g�itrue:�_��/false:�����j
		System.out.println("�@�@��-----------------------------------------------------") ;
	}
	
	//---���\�b�h------------------------------------------------
	
	//accelerator���\�b�h�i���݂̑��x��1km/h�グ��j
	void accelerator(){
		speed++ ;
		System.out.println(owner + "�̎ԁF�i���������Ȃ����j") ;
	}
	
	//brake���\�b�h�i���݂̑��x��1km/h������j
	void brake(){
		speed-- ;
		System.out.println(owner + "�̎ԁF�i�����x���Ȃ����j") ;
	}
	
	//rightOn���\�b�h�i���C�g��_��������j
	void rightOn(){
		right = true ;
		System.out.println(owner + "�̎ԁF�i���͂����邭�Ȃ����j") ;
	}
	
	//rightOff���\�b�h�i���C�g����������j
	void rightOff(){
		right = false ;
		System.out.println(owner + "�̎ԁF�i���͂��Â��Ȃ����j") ;
	}
	//klaxon���\�b�h�i�N���N�V������炷�j
	void klaxon(){
		System.out.println(owner + "�̎ԁF�u�v�b�v�`�`�`�`�`�`�`�`�`�`�b�v") ;
	}
}
