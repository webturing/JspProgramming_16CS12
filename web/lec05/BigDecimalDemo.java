package ag;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		//1.01^365
		System.out.println(Math.pow(1.01, 365));
		System.out.println(Math.pow(0.99, 365));
		System.out.println(new BigDecimal("1.01").pow(365));
		System.out.println(new BigDecimal("0.99").pow(365));
		BigDecimal a=BigDecimal.ONE;
		BigDecimal b=new BigDecimal("7");
		System.out.println(a.divide(b,100,BigDecimal.ROUND_CEILING));
		
	}
}
