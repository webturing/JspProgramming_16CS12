package str;

import java.util.Arrays;


public class RegexDemo {
	public static void main(String[] args) {
		String exp = "1 + 2 - 3 *     11114 /   7  5";
		System.out.println(Arrays.toString(exp.split("\\D+")));// numbers
		System.out.println(Arrays.toString(exp.split("\\s*\\d+\\s*")));// numbers
	}
}
