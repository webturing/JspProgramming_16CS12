package sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo3 {
public static void main(String[] args) {
	String[] words="To know everything is to know nothing".split("\\s+");
	System.out.println(Arrays.asList(words));
	//Arrays.sort(words);
	
	Arrays.sort(words,new Comparator<String>(){
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			//return o1.compareTo(o2);//default dictionary order
			//return o1.length()-o2.length();//���ճ�������
			return o2.length()-o1.length();
		}
		
	});
	
	System.out.println(Arrays.asList(words));
}
}
