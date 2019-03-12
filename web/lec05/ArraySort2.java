import java.util.Arrays;
import java.util.Comparator;

public class ArraySort2 {
	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		Double[] d = { 0.2, 0.3, 0.5, 1.4, 1.1 };
		// Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		Arrays.sort(d, new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				// TODO Auto-generated method stub
				// if(o1>o2)return -1;
				// if(o2>o1)return 1;
				// return 0;
				return o2.compareTo(o1);
			}

		});
		System.out.println(Arrays.toString(d));
	}
}
