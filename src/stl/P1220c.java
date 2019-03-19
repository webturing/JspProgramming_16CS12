package stl;

import java.util.TreeSet;

public class P1220c {
	public static void main(String[] args) {
		int a[] = { 1, 1, 6, 3, 3 };
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(Integer i:a){
			set.add(i);
		}
		for(Integer i:set)
			System.out.println(i);
	}
}
