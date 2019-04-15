package fdao;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Input your account:");
		String name = cin.next();
		System.out.println("Input your password:");
		String password = cin.next();

		// if(name=="admin"&&password=="123456")
		if (name.equals("admin") && password.equals("123456"))
			System.out.println("Welcome!");
		else
			System.out.println("Please check your name and password!");

	}
}
