class Sample1_13_3 {
	public static void main (String[] args) {
		
		//���x���icontinue���j�̂�����
		System.out.println("�����x���icontinue���j�̂����� �����x���Ȃ�");
		
		for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("�@�@��i��" + i  + "�̂Ƃ��ŏ��� i*j > 15 �ƂȂ�j�̒l");
					System.out.println("�@�@j�F" + j);
					continue;
				}
			}
		}
		
		System.out.println("�����x���icontinue���j�̂����� �����x������");
		
		uzuz2:for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("�@�@��i��" + i  + "�̂Ƃ��ŏ��� i*j > 15 �ƂȂ�j�̒l");
					System.out.println("�@�@j�F" + j);
					continue uzuz2;
				}
			}
		}
	}
}
