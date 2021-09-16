/*-< ���K�FEx1_14_2 >---------------------------------
�R�}���h���C����������1�ȏ�̐��l���󂯎��A����1��1�̐��l���w���������i�̒艿�Ƃ����Ƃ��A
���v���z�i�ō��j�����߁A�X�ɒl�����𗘂��������z��\������v���O��������肽���B
main���\�b�h�̓��e�͏����������ɏ������ʂ�悤�ȃ��\�b�h���R�����g�ɏ]���ď����Ă��������B
----------------------------------------------------*/
public class Ex1_14_2 {
	
	//�I�I�Imain���\�b�h�̏����͏��������Ȃ��ł��������I�I�I
	public static void main (String[] args) {
		
		int totalPrice = 0 ;                                 //�w���������i�̍��v���z
		
		//�R�}���h���C����������w���������i�̍��v���z�i�艿�j���擾
		for(int i = 0 ; i < args.length ; i++ ){
			totalPrice += Integer.parseInt( args[i] );
		}
		
		//discount���\�b�h���g���Ēl������K�p���A�l������̋��z���擾
		int discountedPrice = discount( totalPrice );        //�l������̋��z
		
		//calcTaxPayment���\�b�h���g���Ďx�����z�i�ō��j���擾
		int taxPayment = calcTaxPayment( discountedPrice );  //�x�����z�i�ō��j
		
		//�x�����z�i�ō��j��\��
		System.out.println("�l������̎x�����z�F" + taxPayment + "�~" );
		
	}
	
	
	/*
	**�ȉ��̎d�l�������\�b�hdiscount���쐬���Ă��������B
	**  - �����Ƃ��Ď󂯎�����l��1000�ȏ�5000�ȉ��̏ꍇ�A1000���傫�����ɂ���10���l�����ɂ���
	**  - �����Ƃ��Ď󂯎�����l��5000���傫���ꍇ�A1000���傫��5000�~�ȉ��̕��ɂ���10��OFF�A5000�~���傫�����ɂ���20���l�����ɂ���
	**  - �l�����z�͏����_�ȉ��؂�̂ĂŌv�Z����i�L���X�g���g���܂��傤�j
	**  - �l�����z�̏����5000�~�Ƃ���
	*/
	static int discount( int pr ){           //�A���_�[�o�[��K�؂ȓ��e�ɏ��������Ă�������
		
		
		final int    DISCOUNT_BORDER1   = 1000 ;   //�l���������̋��E�l�i1000�~�j
		final int    DISCOUNT_BORDER2   = 5000 ;   //�l���������̋��E�l�i5000�~�j
		final double DISCOUNT_RATE1     = 0.1  ;   //�l�������i1000�~�ȏ�5000�����j
		final double DISCOUNT_RATE2     = 0.2  ;   //�l�������i5000�~�ȏ�j
		final int    DISCOUNT_PRICE_MAX = 5000 ;   //�l�����z�̏��
		
		int priceDownTemp = 0 ;                    //���̒l�����z
		
		//���̒l�����z�ipriceDownTemp�j�̌v�Z
		if ( DISCOUNT_BORDER1 <= pr && pr <= DISCOUNT_BORDER2 ){
			
			//�����Ƃ��Ď󂯎�����l��1000�ȏ�5000�ȉ��̏ꍇ�A1000���傫�����ɂ���10���l�����ɂ���
			//�i�����_�ȉ��؂�̂āj
			priceDownTemp = (int)( (pr - DISCOUNT_BORDER1) * DISCOUNT_RATE1 ) ;
			
		}else if ( DISCOUNT_BORDER2 < pr ){
			
			//�����Ƃ��Ď󂯎�����l��5000���傫���ꍇ�A1000���傫��5000�~�ȉ��̕��ɂ���10��OFF�A
			//5000�~���傫�����ɂ���20���l�����ɂ���i�����_�ȉ��؂�̂āj
			priceDownTemp = (int)(   (DISCOUNT_BORDER2 - DISCOUNT_BORDER1) * DISCOUNT_RATE1 
			                         + ( pr - DISCOUNT_BORDER2) * DISCOUNT_RATE2            ) ;
			
		}
		
		int priceDown = 0 ;  //�ŏI�I�Ȓl�����z
		
		//�l�����z�̏�����������A�{���̒l�����z�����߂�
		if( DISCOUNT_PRICE_MAX < priceDownTemp ){
			
			//�l�����̏���z�i5000�~�j�𒴂��Ă���ꍇ�A�l�����z������z�ōĐݒ肷��
			priceDown = DISCOUNT_PRICE_MAX ;
			
		}else{
			
			//�l�����̏���z�i5000�~�j�𒴂��Ă��Ȃ��ꍇ�A���̒l�����z�����̂܂ܒl�����z�Ƃ��č̗p����
			priceDown = priceDownTemp ;
			
		}
		
		//�l�����K����̋��z��Ԃ�
		return pr - priceDown ;
		
	}
	
	
	/*
	**�ȉ��̎d�l�������\�b�hcalcTaxPayment���쐬���Ă��������B
	**  - �����Ƃ��Ď󂯎�����l�̐ō����i�i����ł�8���Ƃ���j���v�Z���ĕԂ�
	**  - �ō����i�͐����i�����_�ȉ��؂�̂āj�ŕԂ�
	*/
	static int calcTaxPayment( int pr ){        //�A���_�[�o�[��K�؂ȓ��e�ɏ��������Ă�������
		
		final double SCALE_TAX = 1.08 ;                   //����Ŕ{���i8%�j
		
		int priceIncludingTax = (int)( pr * SCALE_TAX ) ; //�ō����i�i�����_�ȉ��؂�̂āj
		
		return priceIncludingTax ;        //�ō����i��Ԃ�
		
	}
}
