package io;

import java.util.Scanner;
/**
 * Input 
 * 2
 * 1 2
 * 3 4
 * Output
 * 3
 * 7
 */
public class FormatedInput3 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int T=cin.nextInt();
		while(T-->0){
			int a=cin.nextInt();
			int b=cin.nextInt();
			System.out.println(a+b);
		}
		cin.close();
		
	}
}
