class Sample1_09_1 {
	public static void main (String[] args) {
		
		//�Q�ƌ^�Ɋi�[����Ă���̂͏ꏊ��񁨕\��������ǂ��Ȃ�H�H
		
		int[][] rooms = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}} ;
		
		System.out.println("���Q�ƌ^�̕ϐ�rooms�Ɋi�[����Ă���l");
		System.out.println("rooms�F" + rooms );
		
		
		//String�^�ϐ����m�Ŋ֌W���Z�q��p����ۂ̒���
		
		String  name   = "���R" ;
		
		boolean check1 = name == args[0] ;
		System.out.println("���w==�x��p����String�^�̔�r");
		System.out.println("check1�F" + check1 );
		
		boolean check2 = name.equals( args[0] ) ;
		System.out.println("���wequals�x��p����String�^�̔�r");
		System.out.println("check2�F" + check2 );
		
		
		//�y���Ӂz�^���v���~�e�B�u�Ƃ��Đ������ꂽString�^�ϐ��͈�������₱����
		
		String  nameOfficial1 = new String("���R") ;  //�����ȍ����������String�^�ϐ�
		String  nameOfficial2 = new String("���R") ;  //�����ȍ����������String�^�ϐ�
		String  nameGizi1   = "���R" ;                //�^���v���~�e�B�u�ȍ����������String�^�ϐ�
		String  nameGizi2   = "���R" ;                //�^���v���~�e�B�u�ȍ����������String�^�ϐ�
		
		boolean check3 = nameOfficial1 == nameOfficial2 ;
		System.out.println("���w==�x��p������r�i�����̐����j");
		System.out.println("check3�F" + check3 );
		
		boolean check4 = nameGizi1 == nameOfficial1 ;
		System.out.println("���w==�x��p������r�i�^���̐����j");
		System.out.println("check4�F" + check4 );
		
		boolean check5 = nameGizi1 == nameGizi2 ;
		System.out.println("���w==�x��p������r�i�^���̋^���j�����ځI");
		System.out.println("check5�F" + check5 );
		
	}
}
