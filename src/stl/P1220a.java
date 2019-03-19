package stl;

import java.util.Arrays;

public class P1220a {
	public static void main(String[] args) {
		int a[] = {1, 1, 6, 3, 3};
		Arrays.sort(a);
		System.out.println(a[0]);
		int recent = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == recent) continue;
			System.out.println(a[i]);
			recent = a[i];
		}
	}
}
