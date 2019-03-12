import java.math.BigInteger;
import java.util.Scanner;

public class HighPrecision {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// int a=cin.nextInt();
		// int b=cin.nextInt();
		BigInteger a = cin.nextBigInteger();
		BigInteger b = cin.nextBigInteger();
		System.out.println(a.multiply(b));
	}
}
