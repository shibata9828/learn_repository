class Ex2_03_1_Player {
	
	//---�萔----------------------------------------------------------
	private final String HAND_G = "�O�[" ;     //�W�����P���̎�i�O�[�j
	private final String HAND_C = "�`���L" ;   //�W�����P���̎�i�`���L�j
	private final String HAND_P = "�p�[" ;     //�W�����P���̎�i�p�[�j
	
	
	//---�t�B�[���h----------------------------------------------------
	private String name       ;   //���O
	private String handStatus ;   //�W�����P���̎�
	
	
	//---�R���X�g���N�^------------------------------------------------
	public Ex2_03_1_Player(String nm){
		this.name       = nm ;                   //���O
	}
	
	
	//---���\�b�h------------------------------------------------------
	
	//�t�B�[���hhandStatus�Ɂu�O�[�v�u�`���L�v�u�p�[�v�̂����ꂩ�������_���ɐݒ�
	public void makeHandStatus(){
		
		int random1to3 = 1 + (int)( Math.random() * 3.0 );    //1�`3�̃����_���Ȓl���擾
		
		//�擾���������_���Ȑ��l�ɉ����ăt�B�[���hhandStatus���X�V�i1�F�O�[�A2�F�`���L�A3�F�p�[�j
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
	
	
	//---getter/setter-------------------------------------------------
	
	//�t�B�[���hname��getter
	public String getName(){
		return this.name ;
	}
	//�t�B�[���hhandStatus��getter
	public String getHandStatus(){
		return this.handStatus ;
	}
	
}
