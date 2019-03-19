package stl;

import java.util.Arrays;

/**
 * 
 * 
 * Array fixed Capacity
 */

public class ArraysDemo {
public static void main(String[] args) {
	int [] a=new int [10];
	
	for(int i=0;i<10;i++)
		a[i]=i;
	System.out.println(Arrays.toString(a));
	int b[]=new int[20];
	for(int i=0;i<10;i++)
		b[i]=a[i];
	a=b;
	
	for(int i=10;i<20;i++)
		a[i]=i;
	System.out.println(Arrays.toString(a));
}
}
