package jw.lec05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		HashMap<String,String> users=new HashMap<String,String>();
		
		try {
			Scanner fin=new Scanner(new FileReader("users.txt"));
			
			while(fin.hasNext())
				{
					String words[]=fin.nextLine().split("\\s+");
					String name=words[0];
					String password=words[1];
					users.put(name, password); 
					
				}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(users);
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
