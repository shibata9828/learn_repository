class Sample2_07_2_3_Calc {
	void calc (int x , int y) {
		
		try{
			
			System.out.println( x / y ) ;                  //�R�}���h���C������2��0���@
			
		}catch(ArithmeticException e){                      //�[���������������ꍇ�̑Ώ�
			System.out.println("[ERROR]��O�����m���܂���") ;
			e.printStackTrace();
		}catch(NumberFormatException e){                    //�����̌`���łȂ������񂪓��͂��ꂽ�ꍇ�̑Ώ�
			System.out.println("[ERROR]��O�����m���܂���") ;
			e.printStackTrace();
		}finally{
			System.out.println("��finally�iSample2_07_2_3_Calc�N���X�j") ;
		}
		
	}
}

