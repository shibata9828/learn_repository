class Sample2_07_2_2 {
	public static void main (String[] args) {
		
		try{
			int x = Integer.parseInt(args[0]) ;            //�R�}���h���C������1�������łȂ����B
			int y = Integer.parseInt(args[1]) ;            //�R�}���h���C��������1���A�A�R�}���h���C������2�������łȂ����B
			
			System.out.println( x / y ) ;                  //�R�}���h���C������2��0���@
			
		}catch(ArithmeticException e){                      //�@�[���������������ꍇ�̑Ώ�
			System.out.println("[�[����]" + e + "���������܂���") ;
		}catch(ArrayIndexOutOfBoundsException e){           //�A���݂��Ȃ��z��̃C���f�b�N�X���w�肳�ꂽ�ꍇ�̑Ώ�
			System.out.println("[�C���f�b�N�X�͈͊O�w��]" + e + "���������܂���") ;
		}catch(NumberFormatException e){                    //�B�����̌`���łȂ������񂪓��͂��ꂽ�ꍇ�̑Ώ�
			System.out.println("[���͒l�s���i�����łȂ��j]" + e + "���������܂���") ;
		}
		
		System.out.println("�Ō�܂ŏ������܂���") ;
	}
}

