public class Ex2_02_2_Janken {
	
	public static void main(String[] args) {
		
		/*<�V�i���I�@>
		**�R�}���h���C���������3�̕�������󂯎��
		*/
		String nameP1      = args[0] ; //�W�����P�����s���v���C���[1�̖��O
		String nameP2      = args[1] ; //�W�����P�����s���v���C���[2�̖��O
		String nameReferee = args[2] ; //�R���̖��O
		
		
		/*<�V�i���I�A>
		**2���̃v���C���[�y�ѐR������ɓo�ꂳ����i�C���X�^���X������j
		*/
		Ex2_02_2_Player  p1      = new Ex2_02_2_Player(  nameP1 ) ;      //�v���C���[1���C���X�^���X��
		Ex2_02_2_Player  p2      = new Ex2_02_2_Player(  nameP2 ) ;      //�v���C���[2���C���X�^���X��
		Ex2_02_2_Referee ref     = new Ex2_02_2_Referee( nameReferee ) ; //�R�����C���X�^���X��
		
		
		/*<�V�i���I�B>
		**���ꂼ��̃v���C���[�Ɏ�����点��
		*/
		//���点��O�Ɂu����񂯂�E�E�E�ۂ�I�I�I�I�I�v�ƐR��������
		ref.startJanken();
		
		//���ꂼ��̃v���C���[�Ɏ�����点��
		p1.makeHandStatus();
		p2.makeHandStatus();
		
		//���ꂼ��̃v���C���[���ǂ�Ȏ���o�������R��������
		ref.checkHand(p1);
		ref.checkHand(p2);
		
		
		/*<�V�i���I�C>
		**�R�������s�𔻒肵�A���ʂ�����
		*/
		ref.judgeJanken(p1,p2);
		
		
	}
}
