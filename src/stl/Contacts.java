package stl;

import java.util.HashMap;
import java.util.TreeMap;

public class Contacts {
    public static void main(String[] args) {
        TreeMap<String, String> contacts = new TreeMap<>();
        contacts.put("Tom", "123456789");
        contacts.put("Jerry", "987654321");
        System.out.println(contacts);
        contacts.put("Tom", "888888888888");
        contacts.remove("Jerry");
        contacts.put("peter", "999999");
        System.out.println(contacts);
        System.out.println(contacts.containsKey("peter"));
        System.out.println("Calling " + contacts.get("peter") + ".....");


    }
}
