/*-< ���K�FEx1_15_1 >---------------------------------
BigDecimal�̈����ɂ���API�h�L�������g�ȂǂŒ��ׂȂ���
�ȉ��̌��ʂ��\�������v���O����������Ă݂܂��傤�I
----------------------------------------------------*/
import java.math.BigDecimal;
import java.math.RoundingMode;

class Ex1_15_1{
	public static void main (String[] args) {
		
		//(1) 0.2 * 83 - 10.6
		BigDecimal bd1_1      = new BigDecimal( "0.2" );
		BigDecimal bd1_2      = new BigDecimal( "83" );
		BigDecimal bd1_3      = new BigDecimal( "-10.6" );
		BigDecimal bd1_result = ( bd1_1.multiply( bd1_2 ) ).add( bd1_3 );
		System.out.println(bd1_result);
		
		
		//(2) 0.2 * 83 - 10.6 / 3�@��������2�ʂ܂łŕ\���i������3�ʈȉ��͎l�̌ܓ��j
		//<�⑫>
		// BigDecimal�ɂ�銄��Z�͊ۂ߂̎w�肪�K�v�ł��I
		// XXX �� YYY�����ď�����2�ʂŕ\���i������3�ʈȉ��͐؂�̂āj
		// XXX.divide(YYY, 2, RoundingMode.DOWN);
		BigDecimal bd2_1     = new BigDecimal( "0.2" );
		BigDecimal bd2_2     = new BigDecimal( "83" );
		BigDecimal bd2_3     = new BigDecimal( "-10.6" );
		BigDecimal bd2_4     = new BigDecimal( "3" );
		BigDecimal bd2_result = ( bd2_1.multiply( bd2_2 ) ).add( bd2_3.divide( bd2_4 , 2 , RoundingMode.HALF_UP));
		System.out.println(bd2_result);
		
	}
}
