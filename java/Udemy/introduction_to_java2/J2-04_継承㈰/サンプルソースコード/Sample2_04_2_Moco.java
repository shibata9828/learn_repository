class Sample2_04_2_Moco extends Sample2_04_2_Dog {
	
	//---�t�B�[���h-------------------------------------
	
	String name = "MOCO" ; //���O
	
	//---���\�b�h---------------------------------------
	
	//���킢���X�g���b�`�iUZUZ�̏A����MOCO�����̓��Z�j
	void cuteStretch(){
		System.out.println("���킢���X�g���b�`�I") ;
	}
	
	//�X�[�p�[�N���X���܂߁A���ׂẴt�B�[���h�̏���\��
	void printAllInfo(){
		System.out.println( "name:" + name + " / type:" + type + " / group:" + group ) ;
	}
	
	//�X�[�p�[�N���X���܂߁A���ׂẴ��\�b�h�����s ��printAllInfo���\�b�h�͏���
	void executeAllAction(){
		cuteStretch() ;
		bark() ;
		breatheLungs() ;
	}
	
}
