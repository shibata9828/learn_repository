public class CalcCakeTotalPrice {
	
	public static void main(String[] args) {
		
		//------------�萔�̒�`------------
		
		final String CAKE_NAME_SHT  = "�V���[�g�P�[�L"     ;  //�V���[�g�P�[�L - ���O
		final int    CAKE_PRICE_SHT = 320                  ;  //�V���[�g�P�[�L - �l�i
		final String CAKE_NAME_MNB  = "�����u����"         ;  //�����u���� - ���O
		final int    CAKE_PRICE_MNB = 350                  ;  //�����u���� - �l�i
		final String CAKE_NAME_CHO  = "�`���R���[�g�P�[�L" ;  //�`���R���[�g�P�[�L - ���O
		final int    CAKE_PRICE_CHO = 370                  ;  //�`���R���[�g�P�[�L - �l�i
		final String CAKE_NAME_ICH  = "�������̃^���g"     ;  //�������̃^���g - ���O
		final int    CAKE_PRICE_ICH = 400                  ;  //�������̃^���g - �l�i
		final String CAKE_NAME_CHZ  = "�`�[�Y�P�[�L"       ;  //�`�[�Y�P�[�L - ���O
		final int    CAKE_PRICE_CHZ = 300                  ;  //�`�[�Y�P�[�L - �l�i
		
		final int    DISCOUNT_APPLYING_PRICE = 1000        ;  //�������K�p�������z
		final double DISCOUNT_RATE  = 0.8                  ;  //������
		final double TAX            = 1.08                 ;  //�����
		
		
		//------------�x�����z�̌v�Z------------
		
		String checkCakeName   = ""   ;  //�����Ώۂ̃P�[�L��
		int    checkCakeCount  = 0    ;  //�����Ώۂ̃P�[�L�̌�
		int    totalPrice      = 0    ;  //���v���z
		int    payment         = 0    ;  //�x�����z
		
		
		//���v���z���v�Z����
		for (int i = 0 ; i < args.length ; i += 2) {  //�R�}���h���C����������P�[�L���ƌ����Z�b�g�Ŏ擾���郋�[�v
			
			//�����Ώۂ̃P�[�L���ƌ����擾
			checkCakeName  = args[i];
			checkCakeCount = Integer.parseInt( args[i+1] );
			
			//���v���z�̌v�Z
			//�P�[�L�����Ƃɏ��v���Z�o���č��v���z�ɑ�������
			switch( checkCakeName ){
				
				//�P�[�L�����u�V���[�g�P�[�L�v�̏ꍇ
				case CAKE_NAME_SHT :
					totalPrice += CAKE_PRICE_SHT * checkCakeCount ;
					break;
				
				//�P�[�L�����u�����u�����v�̏ꍇ
				case CAKE_NAME_MNB :
					totalPrice += CAKE_PRICE_MNB * checkCakeCount ;
					break;
				
				//�P�[�L�����u�`���R���[�g�P�[�L�v�̏ꍇ
				case CAKE_NAME_CHO :
					totalPrice += CAKE_PRICE_CHO * checkCakeCount ;
					break;
				
				//�P�[�L�����u�������̃^���g�v�̏ꍇ
				case CAKE_NAME_ICH :
					totalPrice += CAKE_PRICE_ICH * checkCakeCount ;
					break;
				
				//�P�[�L�����u�`�[�Y�P�[�L�v�̏ꍇ
				case CAKE_NAME_CHZ :
					totalPrice += CAKE_PRICE_CHZ * checkCakeCount ;
					break;
				
			}
		}
		
		//�x�����z���v�Z����
		if (totalPrice > DISCOUNT_APPLYING_PRICE) {        //���v���z�������Ώۂł���ꍇ
			//�����������������ō��݊z���v�Z���Ďx���z�Ƃ���
			payment = (int)(totalPrice * DISCOUNT_RATE * TAX);  
			
		}else{                                    //���v���z�������ΏۂłȂ��ꍇ
			//�ō��݊z���v�Z���Ďx���z�Ƃ���
			payment = (int)(totalPrice * TAX);
			
		}
		
		//------------���b�Z�[�W�̕\��------------
		
		System.out.println("���v���z��" + payment + "�~�ł��B");
		
	}
}