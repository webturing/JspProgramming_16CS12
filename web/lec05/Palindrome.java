public class Palindrome {
	public static void main(String[] args) {
		System.out.println(true==isPalindrome("aha"));
		System.out.println(false==isPalindrome("ahab"));
		System.out.println(true==isPalindrome("ahaha"));
		System.out.println(true==isPalindrome("a"));
		System.out.println(true==isPalindrome("aa"));
		
	}

	private static boolean isPalindrome(String s) {
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
}
