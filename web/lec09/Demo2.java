package jw.lec05;

import java.util.HashMap;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		HashMap<String,String> users=new HashMap<String,String>();
		
		users.put("admin", "123456");
		users.put("tom", "123");
		users.put("cat", "456");
		
		Scanner cin = new Scanner(System.in);
		System.out.println("Input your account:");
		String name = cin.next();
		System.out.println("Input your password:");
		String password = cin.next();
		
		
		if(users.containsKey(name))
		{
			String password2=users.get(name);
			if(password.equals(password2))
				System.out.println("Welcome "+name);
			else
				System.out.println("Wrong username or password!");
		}
		else
		{
			System.out.println("No such user!");
		}

		

	}
}
