package io;

import java.util.Scanner;

public class IO {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(a + b);
		}
		cin.close();
	}
}
