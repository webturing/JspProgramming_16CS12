package io;

import java.util.Scanner;
/**
 * 3
 * an apple a day
 * a  cool man
 * hello world
 * 
 * 
 * AAAD
 * ACM
 * HW
 * 
 * @author Administrator
 *
 */
public class IO5 {
public static void main(String[] args) {
	//next()/nextLine()
	Scanner cin=new Scanner(System.in);
	//String s=cin.next();
	String s=cin.nextLine();
	System.out.println(s);
	
	cin.close();
	
}
}
