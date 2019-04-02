package jw.lec05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class CheckLogin {
	static 	HashMap<String, String> users = new HashMap<String, String>();

	static{
		try {
			Scanner fin = new Scanner(new FileReader("users.txt"));

			while (fin.hasNext()) {
				String words[] = fin.nextLine().split("\\s+");
				String name = words[0];
				String password = words[1];
				users.put(name, password);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean check(String username, String pass) {
	

		if (users.containsKey(username)) {
			String password2 = users.get(username);
			if (pass.equals(password2))
				return true;
			else
				return false;
		} else
			return false;

	}

	public static void main(String[] args) {
		System.out.println(check("tom", "cat"));
		System.out.println(check("xiaoming", "1234"));
	}
}
