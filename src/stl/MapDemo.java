package stl;

import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {// Key Value
		TreeMap<String, String> contacts = new TreeMap<String, String>();
		contacts.put("Tom", "123456");
		contacts.put("Jerry", "8888888");
		System.out.println(contacts);
		System.out.println(contacts.keySet());
		System.out.println("Calling " + contacts.get("Tom"));
		contacts.put("Tom", "987654321");//
		System.out.println("Calling " + contacts.get("Tom"));
		// contacts.remove("Tom");

		System.out.println("Calling " + contacts.get("Tom"));
		// travel map

		for (String user : contacts.keySet())
			System.out.println(user + " " + contacts.get(user));
	}
}
