public class Ex2_03_1_Referee {
	
	
	//---�萔----------------------------------------------------------
	private final String HAND_G = "�O�[" ;     //�W�����P���̎�i�O�[�j
	private final String HAND_C = "�`���L" ;   //�W�����P���̎�i�`���L�j
	private final String HAND_P = "�p�[" ;     //�W�����P���̎�i�p�[�j
	
	
	//---�t�B�[���h----------------------------------------------------
	private String name       ;   //���O
	
	
	//---�R���X�g���N�^------------------------------------------------
	public Ex2_03_1_Referee(String nm){
		this.name = nm ;          //���O
	}
	
	
	//---���\�b�h------------------------------------------------------
	
	//�W�����P���̊J�n��錾����
	public void startJanken(){
		
		messageReferee("����񂯂�E�E�E�ۂ�I�I�I�I�I");
		
	}
	
	//�v���C���[�̎���m�F����
	public void checkHand( Ex2_03_1_Player p ){
	
		//���ʂ��m�F���A�R�����錾����
		if( ( p.getHandStatus() ).equals( HAND_G ) ){
			
			//�u�O�[�v�̏ꍇ
			messageReferee( p.getName() + "����̎�̓O�[�ł����I");
			
		}else if( ( p.getHandStatus() ).equals( HAND_C ) ){
			
			//�u�`���L�v�̏ꍇ
			messageReferee( p.getName() + "����̎�̓`���L�ł����I");
			
		}else if( ( p.getHandStatus() ).equals( HAND_P ) ){
			
			//�u�p�[�v�̏ꍇ
			messageReferee( p.getName() + "����̎�̓p�[�ł����I");
			
		}else{
			
			//�s���ȏꍇ�̓G���[���b�Z�[�W���o��
			System.out.println("[ERROR]�W�����P���̔��肪�s���ł��B");
			
		}
	}
	
	//�W�����P���̔��聕���ʔ��\������
	public void judgeJanken(Ex2_03_1_Player p1,Ex2_03_1_Player p2){
		
		//�͂��߂Ɂu���ʂ́E�E�E�v�ƐR��������
		messageReferee("���ʂ́E�E�E");
		
		//���ʂ𔻒肵�A���ʂɉ��������b�Z�[�W��R��������
		if( ( p1.getHandStatus() ).equals( p2.getHandStatus() ) ){
			
			//�������̏ꍇ
			messageReferee("�������I���������I");
			
		}else if(     ( ( p1.getHandStatus() ).equals( HAND_G ) && ( p2.getHandStatus() ).equals( HAND_C ))
		           || ( ( p1.getHandStatus() ).equals( HAND_C ) && ( p2.getHandStatus() ).equals( HAND_P ))
		           || ( ( p1.getHandStatus() ).equals( HAND_P ) && ( p2.getHandStatus() ).equals( HAND_G ))  ) {
			
			//�v���C���[1�����������ꍇ
			messageReferee( p1.getName() + "����̏����I");
			
		}else if(     ( ( p2.getHandStatus() ).equals( HAND_G ) && ( p1.getHandStatus() ).equals( HAND_C ))
		           || ( ( p2.getHandStatus() ).equals( HAND_C ) && ( p1.getHandStatus() ).equals( HAND_P ))
		           || ( ( p2.getHandStatus() ).equals( HAND_P ) && ( p1.getHandStatus() ).equals( HAND_G ))  ) {
			
			//�v���C���[2�����������ꍇ
			messageReferee( p2.getName() + "����̏����I");
			
		}else{
			
			//�s���ȏꍇ�̓G���[���b�Z�[�W���o��
			System.out.println("[ERROR]�W�����P���̔��肪�s���ł��B");
			
		}
	}
	
	//�R���Ƃ��ă��b�Z�[�W��\������
	private void messageReferee(String msg){
		
		System.out.println( this.name + "�u" + msg + "�v");
		
	}
	
	//---getter/setter-------------------------------------------------
	
	//�t�B�[���hname��getter
	public String getName(){
		return this.name ;
	}
	
}
