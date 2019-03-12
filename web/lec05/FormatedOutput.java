public class FormatedOutput {
	public static void main(String[] args) {
		int a = 3, b = 4;
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.printf("%d+%d=%d\n", a, b, a + b);
		System.out.println(String.format("%d+%d=%d", a, b, a + b));
		System.out.println(String.format("%.5f",Math.PI));
	}
}
