class Sample2_06_2 {
	public static void main (String[] args) {
		
		double bottom = 3.0 ; //���
		double height = 7.0 ; //����
		
		System.out.println( "�O�p�`�̖ʐρF" + calcSizeTriangle( bottom , height ) );
	}
	
	//�O�p�`�̖ʐς�߂�l�Ƃ��ĕԂ�
	//�i��1�����F��ӁA��2�����F�����j
	double calcSizeTriangle(double bottom , double height){
		return bottom * height / 2 ;
	}
}

