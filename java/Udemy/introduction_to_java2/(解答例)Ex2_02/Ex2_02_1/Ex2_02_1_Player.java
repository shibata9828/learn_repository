class Ex2_02_1_Player {
	
	//---�萔----------------------------------------------------------
	final String HAND_G = "�O�[" ;     //�W�����P���̎�i�O�[�j
	final String HAND_C = "�`���L" ;   //�W�����P���̎�i�`���L�j
	final String HAND_P = "�p�[" ;     //�W�����P���̎�i�p�[�j
	
	
	//---�t�B�[���h----------------------------------------------------
	String name       ;   //���O
	String handStatus ;   //�W�����P���̎�
	
	
	//---�R���X�g���N�^------------------------------------------------
	Ex2_02_1_Player(String nm){
		this.name       = nm ;                   //���O
	}
	
	
	//---���\�b�h------------------------------------------------------
	
	//�t�B�[���hhandStatus�Ɂu�O�[�v�u�`���L�v�u�p�[�v�̂����ꂩ�������_���ɐݒ�
	void makeHandStatus(){
		
		int random1to3 = 1 + (int)( Math.random() * 3.0 );    //1�`3�̃����_���Ȓl���擾
		
		switch(random1to3){
			case 1:
				this.handStatus = HAND_G ;
				break;
			
			case 2:
				this.handStatus = HAND_C ;
				break;
			
			case 3:
				this.handStatus = HAND_P ;
				break;
		}
	}
}
