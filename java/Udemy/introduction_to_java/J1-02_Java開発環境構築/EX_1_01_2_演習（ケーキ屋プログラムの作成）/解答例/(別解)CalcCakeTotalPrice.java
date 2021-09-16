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
		int    checkCakePrice  = 0    ;  //�����Ώۂ̃P�[�L�̒l�i
		
		//���v���z���v�Z����
		for (int i = 0 ; i < args.length ; i++) {
			
			if(i % 2 == 0){
				//i�������̏ꍇ�F�P�[�L�����擾���A����ɕR�Â��P�[�L�̒l�i�����߂�i���߂��P�[�L�̒l�i�͎��̃��[�v�Ŏg�p�j
				
				//�����Ώۂ̃P�[�L�����擾
				checkCakeName  = args[i];
				
				//�����Ώۂ̃P�[�L���ɕR�Â��P�[�L�̒l�i�����߂�
				switch( checkCakeName ){
				
					//�P�[�L�����u�V���[�g�P�[�L�v�̏ꍇ
					case CAKE_NAME_SHT :
						checkCakePrice = CAKE_PRICE_SHT ;
						break;
					
					//�P�[�L�����u�����u�����v�̏ꍇ
					case CAKE_NAME_MNB :
						checkCakePrice = CAKE_PRICE_MNB ;
						break;
					
					//�P�[�L�����u�`���R���[�g�P�[�L�v�̏ꍇ
					case CAKE_NAME_CHO :
						checkCakePrice = CAKE_PRICE_CHO ;
						break;
					
					//�P�[�L�����u�������̃^���g�v�̏ꍇ
					case CAKE_NAME_ICH :
						checkCakePrice = CAKE_PRICE_ICH ;
						break;
					
					//�P�[�L�����u�`�[�Y�P�[�L�v�̏ꍇ
					case CAKE_NAME_CHZ :
						checkCakePrice = CAKE_PRICE_CHZ ;
						break;
				}
				
			}else{
				//i����̏ꍇ�F�P�[�L�̌����擾���A�O���[�v�Ŏ擾�����l�i�Ɗ|�����킹�ď��v���Z�o���A���v���z�ɉ��Z����
				
				//�����Ώۂ̃P�[�L�̌����擾
				checkCakeCount = Integer.parseInt( args[i] ) ;
				
				//���v���Z�o���A���v���z�ɉ��Z����
				totalPrice += checkCakePrice * checkCakeCount ;
				
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