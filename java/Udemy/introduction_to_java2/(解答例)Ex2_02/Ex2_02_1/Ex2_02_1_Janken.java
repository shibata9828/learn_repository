class Ex2_02_1_Janken{
	public static void main( String[] args ){
		
		//---�萔----------------------------------------------------------
		final String HAND_G = "�O�[" ;     //�W�����P���̎�i�O�[�j
		final String HAND_C = "�`���L" ;   //�W�����P���̎�i�`���L�j
		final String HAND_P = "�p�[" ;     //�W�����P���̎�i�p�[�j
		
		/*<�V�i���I�@>
		**�R�}���h���C���������2�̕�������󂯎��
		**�i�W�����P�����s��2���̃v���C���[�̖��O�Ƃ��ė��p�j
		*/
		String nameP1 = args[0] ; //�W�����P�����s���v���C���[1�̖��O
		String nameP2 = args[1] ; //�W�����P�����s���v���C���[2�̖��O
		
		
		/*<�V�i���I�A>
		**2���̃v���C���[����ɓo�ꂳ����i�C���X�^���X������j
		*/
		Ex2_02_1_Player p1 = new Ex2_02_1_Player( nameP1 ) ;   //�v���C���[1���C���X�^���X��
		Ex2_02_1_Player p2 = new Ex2_02_1_Player( nameP2 ) ;   //�v���C���[2���C���X�^���X��
		
		
		/*<�V�i���I�B>
		**���ꂼ��̃v���C���[�Ɏ�����点��
		*/
		//���点��O�Ɂu����񂯂�E�E�E�ۂ�I�I�I�I�I�v�Ƃ������b�Z�[�W����ʂɕ\������
		System.out.println( "����񂯂�E�E�E�ۂ�I�I�I�I�I" );
		
		//���ꂼ��̃v���C���[�Ɏ�����点��
		p1.makeHandStatus();
		p2.makeHandStatus();
		
		//���ꂼ��̃v���C���[���ǂ�Ȏ���o���������m�F����
		System.out.println( p1.name + "����̎� : " + p1.handStatus );
		System.out.println( p2.name + "����̎� : " + p2.handStatus );
		
		
		/*<�V�i���I�C>
		**���s�̌��ʂ���ʂɕ\������
		*/
		//�͂��߂Ɂu���ʂ́E�E�E�v�Ƃ������b�Z�[�W����ʂɕ\������
		System.out.println( "���ʂ́E�E�E" );
		
		
		//���ʂ𔻒肵�A���ʂɉ��������b�Z�[�W��\������
		if( (p1.handStatus).equals( p2.handStatus ) ){
			
			//�������̏ꍇ
			System.out.println("�������I���������I");
			
		}else if(     (p1.handStatus.equals( HAND_G ) && p2.handStatus.equals( HAND_C ))
		           || (p1.handStatus.equals( HAND_C ) && p2.handStatus.equals( HAND_P ))
		           || (p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_G ))  ) {
			
			//�v���C���[1�����������ꍇ
			System.out.println(p1.name + "����̏����I");
			
		}else if(     (p2.handStatus.equals( HAND_G ) && p1.handStatus.equals( HAND_C ))
		           || (p2.handStatus.equals( HAND_C ) && p1.handStatus.equals( HAND_P ))
		           || (p2.handStatus.equals( HAND_P ) && p1.handStatus.equals( HAND_G ))  ) {
			
			//�v���C���[2�����������ꍇ
			System.out.println(p2.name + "����̏����I");
			
		}else{
			
			//�s���ȏꍇ�̓G���[���b�Z�[�W���o��
			System.out.println("[ERROR]�W�����P���̔��肪�s���ł��B");
			
		}
		
		
	}
}