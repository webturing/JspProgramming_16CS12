import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class HighPrecision2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);		
		//BigDecimal a = cin.nextBigDecimal();
		BigDecimal a=new BigDecimal("1");
		BigDecimal b=new BigDecimal("7");
		int c=100;
		System.out.println(a.divide(b,c,BigDecimal.ROUND_HALF_UP));
	}
}
