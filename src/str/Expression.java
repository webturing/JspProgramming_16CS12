package str;

import java.util.Arrays;


public class Expression {
public static void main(String[] args) {
	String exp="1   +   2 - 3 * 5554 / 15 ";
	System.out.println(Arrays.toString(exp.split("\\D+")));
	System.out.println(Arrays.toString(exp.split("\\s*\\d+\\s*")));
	System.out.println(Arrays.asList("We think we can".toLowerCase().split("we")));
	System.out.println("We think we can".toLowerCase().replace("we","you"));
}
}
