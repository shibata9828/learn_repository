class Sample1_13_2 {
	public static void main (String[] args) {
		
		//���x���ibreak���j�̂�����
		
		System.out.println("�����x���ibreak���j�̂����� �����x���Ȃ�");
		
		for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("�@�@���ŏ���i*j��15���z���邭�݂��킹");
					System.out.println("�@�@i�F" + i + " / j�F" + j);
					break;
				}
			}
		}
		
		
		System.out.println("�����x���ibreak���j�̂����� �����x������");
		
		uzuz1:for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("�@�@���ŏ��� i*j > 15 �ƂȂ�i��j�̑g�ݍ��킹");
					System.out.println("�@�@i�F" + i + " / j�F" + j);
					break uzuz1;
				}
			}
		}
	}
}
