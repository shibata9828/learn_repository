class Sample1_13_4 {
	public static void main (String[] args) {
		
		//switch���̂�����
		
		int num = Integer.parseInt(args[0]) ;  //�R�}���h���C�������Ŏ󂯎�����l
		
		switch (num){
			
			case 1:
				System.out.println("���ɕs��");
				break;
			
			case 2:
				System.out.println("�����s��");
				break;
			
			case 3:
				System.out.println("�ǂ���Ƃ������Ȃ�");
				break;
			
			case 4:
				System.out.println("��������");
				break;
			
			case 5:
				System.out.println("��ϖ���");
				break;
			
			default:
				System.out.println("�����x��1�`5�œ����ĉ�����");
				break;
		}
	}
}
