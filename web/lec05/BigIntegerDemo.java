package ag;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		System.out.println(54321 * 54321);
		System.out.println(Integer.toString(999999, 30));//0-9a-z
		System.out.println(Integer.MAX_VALUE);//21вк
		System.out.println(Long.MAX_VALUE);//900вквк
		BigInteger a=new BigInteger("111111111111111111111111111111111111111111");
		System.out.println(a.pow(2));
		
	}
}
