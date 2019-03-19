package io;

import java.util.Scanner;
/**
 * Input 
 * 1 2
 * 3 4
 * Output
 * 3
 * 7
 */
public class FormatedInput {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int a=cin.nextInt();
			int b=cin.nextInt();
			System.out.println(a+b);
		}
		cin.close();
		
	}
}
