package io;

import java.util.Arrays;
import java.util.Scanner;

/**
  3 1 2 3
  4 1 2 3 4
  
  
  6
  10
 * @author Administrator
 * 
 */
public class IO4App {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int size=cin.nextInt();
			int[] arr=new int[size];
			for(int i=0;i<arr.length;i++)arr[i]=cin.nextInt();
			System.out.println(Arrays.toString(arr));
		}

		cin.close();

	}
}
