class Sample2_01_1_car {
	
	//---�t�B�[���h�i�N���X�����Œ�`���ꂽ�ϐ��j----------------
	
	String  carModel = "�N�[�y" ;  //�Ԏ햼
	String  owner    = "���R"   ;  //�I�[�i�[
	String  color    = "RED"    ;  //�h���F
	int     speed    = 0        ;  //���݂̑��x
	boolean right    = false    ;  //���C�g�itrue:�_��/false:�����j
	
	//---���\�b�h------------------------------------------------
	
	//accelerator���\�b�h�i���݂̑��x��1km/h�グ��j
	void accelerator(){
		speed++ ;
		System.out.println("�i���������Ȃ����j") ;
	}
	
	//brake���\�b�h�i���݂̑��x��1km/h������j
	void brake(){
		speed-- ;
		System.out.println("�i�����x���Ȃ����j") ;
	}
	
	//rightOn���\�b�h�i���C�g��_��������j
	void rightOn(){
		right = true ;
		System.out.println("�i���͂����邭�Ȃ����j") ;
	}
	
	//rightOff���\�b�h�i���C�g����������j
	void rightOff(){
		right = false ;
		System.out.println("�i���͂��Â��Ȃ����j") ;
	}
	//klaxon���\�b�h�i�N���N�V������炷�j
	void klaxon(){
		System.out.println("�u�v�b�v�`�`�`�`�`�`�`�`�`�`�b�v") ;
	}
}
