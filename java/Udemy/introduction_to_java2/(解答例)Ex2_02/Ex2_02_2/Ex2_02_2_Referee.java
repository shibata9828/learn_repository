public class Ex2_02_2_Referee {
	
	
	//---�萔----------------------------------------------------------
	final String HAND_G = "�O�[" ;     //�W�����P���̎�i�O�[�j
	final String HAND_C = "�`���L" ;   //�W�����P���̎�i�`���L�j
	final String HAND_P = "�p�[" ;     //�W�����P���̎�i�p�[�j
	
	
	//---�t�B�[���h----------------------------------------------------
	String name       ;   //���O
	
	
	//---�R���X�g���N�^------------------------------------------------
	Ex2_02_2_Referee(String nm){
		this.name = nm;   //���O
	}
	
	
	//---���\�b�h------------------------------------------------------
	
	//�W�����P���̊J�n��錾����
	void startJanken(){
		
		messageReferee("����񂯂�E�E�E�ۂ�I�I�I�I�I");
		
	}
	
	//�v���C���[�̎���m�F����
	void checkHand( Ex2_02_2_Player p ){
	
		//���ʂ��m�F���A�R�����錾����
		if( (p.handStatus).equals( HAND_G ) ){
			
			//�u�O�[�v�̏ꍇ
			messageReferee(p.name + "����̎�̓O�[�ł����I");
			
		}else if( (p.handStatus).equals( HAND_C ) ){
			
			//�u�`���L�v�̏ꍇ
			messageReferee(p.name + "����̎�̓`���L�ł����I");
			
		}else if( (p.handStatus).equals( HAND_P ) ){
			
			//�u�p�[�v�̏ꍇ
			messageReferee(p.name + "����̎�̓p�[�ł����I");
			
		}else{
			
			//�s���ȏꍇ�̓G���[���b�Z�[�W���o��
			System.out.println("[ERROR]�W�����P���̔��肪�s���ł��B");
			
		}
	}
	
	//�W�����P���̔��聕���ʔ��\������
	void judgeJanken(Ex2_02_2_Player p1,Ex2_02_2_Player p2){
		
		//�͂��߂Ɂu���ʂ́E�E�E�v�ƐR��������
		messageReferee("���ʂ́E�E�E");
		
		//���ʂ𔻒肵�A���ʂɉ��������b�Z�[�W��R��������
		if( (p1.handStatus).equals( p2.handStatus ) ){
			
			//�������̏ꍇ
			messageReferee("�������I���������I");
			
		}else if(     (p1.handStatus.equals( HAND_G ) && p2.handStatus.equals( HAND_C ))
		           || (p1.handStatus.equals( HAND_C ) && p2.handStatus.equals( HAND_P ))
		           || (p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_G ))  ) {
			
			//�v���C���[1�����������ꍇ
			messageReferee(p1.name + "����̏����I");
			
		}else if(     (p2.handStatus.equals( HAND_G ) && p1.handStatus.equals( HAND_C ))
		           || (p2.handStatus.equals( HAND_C ) && p1.handStatus.equals( HAND_P ))
		           || (p2.handStatus.equals( HAND_P ) && p1.handStatus.equals( HAND_G ))  ) {
			
			//�v���C���[2�����������ꍇ
			messageReferee(p2.name + "����̏����I");
			
		}else{
			
			//�s���ȏꍇ�̓G���[���b�Z�[�W���o��
			System.out.println("[ERROR]�W�����P���̔��肪�s���ł��B");
			
		}
	}
	
	//�R���Ƃ��ă��b�Z�[�W��\������
	void messageReferee(String msg){
		
		System.out.println( this.name + "�u" + msg + "�v");
		
	}
}
