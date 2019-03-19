package stl;

import java.util.TreeSet;


public class TwinsString {
public static void main(String[] args) {
		String sa="abcdefafasdfasdfaf";
		String sb="casdfasdfasdfaeb";
		char ca[]=sa.toCharArray();
		char cb[]=sb.toCharArray();
		TreeSet<Character> ta=new TreeSet<Character>();
		TreeSet<Character> tb=new TreeSet<Character>();
		for(char c:ca)ta.add(c);
		for(char c:cb)tb.add(c);
		System.out.println(ta);
		System.out.println(tb);
		System.out.println(ta==tb);
		System.out.println(ta.equals(tb));
}
}
