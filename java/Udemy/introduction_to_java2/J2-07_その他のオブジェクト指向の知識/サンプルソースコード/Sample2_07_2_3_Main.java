class Sample2_07_2_3_Main {
	public static void main (String[] args) {
		
		System.out.println("[INFO]�����J�n") ;
		
		try{
			int x = Integer.parseInt(args[0]) ;
			int y = Integer.parseInt(args[1]) ;
			
			Sample2_07_2_3_Calc calcInstance = new Sample2_07_2_3_Calc();
			
			calcInstance.calc( x , y ) ;
			
		}catch(ArrayIndexOutOfBoundsException e){           //���݂��Ȃ��z��̃C���f�b�N�X���w�肳�ꂽ�ꍇ�̑Ώ�
			System.out.println("[ERROR]��O�����m���܂���") ;
			e.printStackTrace();
		}catch(NumberFormatException e){                    //�����̌`���łȂ������񂪓��͂��ꂽ�ꍇ�̑Ώ�
			System.out.println("[ERROR]��O�����m���܂���") ;
			e.printStackTrace();
		}finally{
			System.out.println("��finally�iSample2_07_2_3_Main�N���X�j") ;
		}
		
		System.out.println("[INFO]����I��") ;
	}
}

