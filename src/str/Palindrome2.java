package str;

public class Palindrome2 {
	public static void main(String[] args) {
		System.out.println(true==isPalindrome("aha"));
		System.out.println(false==isPalindrome("ahab"));
		System.out.println(true==isPalindrome("ahaha"));
		System.out.println(true==isPalindrome("a"));
		System.out.println(true==isPalindrome("aa"));
		
	}

	private static boolean isPalindrome(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
