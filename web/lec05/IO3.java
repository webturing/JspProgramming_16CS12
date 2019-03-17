package io;
import java.util.Scanner;

/**
 * 2
 * 1 2
 * 3 4
 * 
 * 
 * 3
 * 7
 * @author Administrator
 *
 */
public class IO3 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int N=cin.nextInt();
	while(N-->0){
		int a=cin.nextInt();
		int b=cin.nextInt();
		System.out.println(a+b);
	}
	
	cin.close();
}
}
