import java.util.List;
import java.util.ArrayList;

class Sample1_15_3{
	public static void main (String[] args) {
		
		//API�̊��p�iArrayList�j
		
		List<String> dogsNameList = new ArrayList<String>();
		
		dogsNameList.add("�^���E");   //�C���f�b�N�X0�ŗv�f�����������
		dogsNameList.add("�O���[�X"); //�C���f�b�N�X1�ŗv�f�����������
		dogsNameList.add("���R");     //�C���f�b�N�X2�ŗv�f�����������
		dogsNameList.add("�`���R");   //�C���f�b�N�X3�ŗv�f�����������
		
		System.out.println("���udogsNameList.remove(1)�v���s�O");
		for( int i = 0 ; i < dogsNameList.size() ; i++ ){
			System.out.println( dogsNameList.get(i) );
		}
		
		dogsNameList.remove(1);
		
		System.out.println("���udogsNameList.remove(1)�v���s��");
		for( int i = 0 ; i < dogsNameList.size() ; i++ ){
			System.out.println( dogsNameList.get(i) );
		}
		
	}
}