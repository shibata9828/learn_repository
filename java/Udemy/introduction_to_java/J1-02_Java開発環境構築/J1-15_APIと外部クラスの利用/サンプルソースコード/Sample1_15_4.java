import java.util.List;
import java.util.ArrayList;

class Sample1_15_4{
	public static void main (String[] args) {
		
		//API�̊��p�iArrayList�i���b�p�[�N���X�̊��p�j�j
		
		/*�R�}���h���C�������Ŏ󂯎���������̗ݏ�̐��̂����A100�����̂��̂�ArrayList�Ɋi�[���A�i�[���ꂽ���ł̍ő�l��\������v���O�������쐬����B
		**�y��z�R�}���h���C�������ł̓��́F3 �� �i�[����鐔�F3 , 9 , 27 , 81
		*/
		
		int receiveNumber = Integer.parseInt(args[0]) ;           //���[�v����calcNumber�Ɋ|���鐔�i�R�}���h���C�������Ŏ󂯎�����l�j
		int calcNumber    = receiveNumber ;                       //�\�����鐔�i�����l�F�R�}���h���C�������Ŏ󂯎�����l�j
		List<Integer> numberList = new ArrayList<Integer>(); //�i�[�ɗp����ArrayList
		
		//�R�}���h���C�������Ŏ󂯎���������̗ݏ�̐��̂����A100�����̂��̂�ArrayList�Ɋi�[����v���O�������쐬����B
		while( calcNumber < 100 ){
			
			numberList.add( calcNumber );
			
			calcNumber *= receiveNumber ;
			
		}
		
		//�ő�l�̕\��
		int numberListlastIndex = numberList.size() - 1 ;         //�ő�l���i�[���Ă���v�f�̃C���f�b�N�X���擾�i�v�f��-1�j
		System.out.println( "�ő�l�F" + numberList.get( numberListlastIndex ) );
		
	}
}