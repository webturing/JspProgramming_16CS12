package stl;

import java.util.Collections;
import java.util.Vector;
/**
 * Vector 
 * contains
 * add 
 * @author Administrator
 *
 */
public class P1220b {
	public static void main(String[] args) {
		int a[] = {1, 1, 6, 3, 3};
		Vector<Integer> v = new Vector<Integer>();
		for (int i : a) {
			if (!v.contains(i))
			v.add(i);
		}
		Collections.sort(v);
		System.out.println(v);

	}
}
