import java.math.BigDecimal;

class Sample1_15_2{
	public static void main (String[] args) {
		
		//API�̊��p�iBigDecimal�ɂ�鏬���v�Z�j
		
		System.out.println("���w1.5 - 6 * 0.1�x�̌v�Z�idouble�^�j");
		System.out.println( 1.5 - 6 * 0.1 );
		
		System.out.println("���w1.5 - 6 * 0.1�x�̌v�Z�iBigDecimal�^�j");
		BigDecimal b1     = new BigDecimal( 1.5 ) ;
		BigDecimal b2     = new BigDecimal( -6 ) ;
		BigDecimal b3     = new BigDecimal( 0.1 ) ;
		BigDecimal result = b1.add( b2.multiply( b3 ) ) ;
		System.out.println(result);
	}
}
