/*-< ���K�FEx1_13_2 >---------------------------------
�R�}���h���C�������Ŏ󂯎���������iA�^�F1, B�^�F2, O�^�F3, AB�^�F4�j�ɉ����āA
�ȉ��̎��s���ʂ�\������v���O�������쐬���Ă��������B
�������Aswitch����K���g�p���Ă��������B

  (A�^)�����͂��ꂽ�ꍇ �F"���Ȃ��͙{���ʂȐ��i�̕��ł��ˁH"
  (B�^)�����͂��ꂽ�ꍇ �F"���Ȃ��̓}�C�y�[�X�Ȑ��i�̕��ł��ˁH"
  (O�^)�����͂��ꂽ�ꍇ �F"���Ȃ��͑�G�c�Ȑ��i�ł��ˁH"
  (AB�^)�����͂��ꂽ�ꍇ�F"���Ȃ��͓V�˔��ȕ��ł��ˁH"
  ��L�ȊO              �F"������1�`4�œ����Ă�������"

----------------------------------------------------*/
public class Ex1_13_2 {
	public static void main (String[] args) {
		
		//�萔
		final String MESSAGE_A       = "���Ȃ��͙{���ʂȐ��i�̕��ł��ˁH";       //���b�Z�[�W�iA�^�j
		final String MESSAGE_B       = "���Ȃ��̓}�C�y�[�X�Ȑ��i�̕��ł��ˁH";   //���b�Z�[�W�iB�^�j
		final String MESSAGE_O       = "���Ȃ��͑�G�c�Ȑ��i�ł��ˁH";           //���b�Z�[�W�iO�^�j
		final String MESSAGE_AB      = "���Ȃ��͓V�˔��ȕ��ł��ˁH";             //���b�Z�[�W�iAB�^�j
		final String MESSAGE_DEFAULT = "������1�`4�œ����Ă�������";             //���b�Z�[�W�i���̑��j
		
		//���t�^�i���o�[�iA�^�F1, B�^�F2, O�^�F3, AB�^�F4�j���R�}���h���C����������擾
		int bloodTypeNumber = Integer.parseInt(args[0]) ;
		
		//--------------------------------
		//���t�^�i���o�[�ɉ��������b�Z�[�W���o��
		//--------------------------------
		switch(bloodTypeNumber){
			case 1:                                //���t�^�i���o�[�iA�^�F1�j�̏ꍇ
				System.out.println(MESSAGE_A);
				break;
			
			case 2:                                //���t�^�i���o�[�iB�^�F2�j�̏ꍇ
				System.out.println(MESSAGE_B);
				break;
			
			case 3:                                //���t�^�i���o�[�iO�^�F3�j�̏ꍇ
				System.out.println(MESSAGE_O);
				break;
			
			case 4:                                //���t�^�i���o�[�iAB�^�F4�j�̏ꍇ
				System.out.println(MESSAGE_AB);
				break;
			
			default:                               //���t�^�i���o�[��1�`4�ȊO�̏ꍇ
				System.out.println(MESSAGE_DEFAULT);
				break;
		}
	}
}