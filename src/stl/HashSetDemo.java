package stl;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		int a[] = { 45, 23, 17, 9, 88 ,88};
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i : a) {
			hset.add(i);
			System.out.println(hset);
		}

	}
}
