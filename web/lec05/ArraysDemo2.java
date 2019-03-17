package ag;

import java.util.Arrays;
import java.util.Comparator;

class Point implements Comparable<Point> {
	int x, y;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x, y);
	}

	@Override
	public int compareTo(Point that) {
		// TODO Auto-generated method stub
		return this.x - that.x;
	}
}

public class ArraysDemo2 {
	public static void main(String[] args) {
		Point[] points = new Point[10];
		//System.out.println(points[0].x);//java.lang.NullPointerException
		System.out.println(Arrays.asList(points));
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point();
			points[i].x = (int) (Math.random() * 100);
			points[i].y = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.asList(points));
		Arrays.sort(points);
		System.out.println(Arrays.asList(points));
		Arrays.sort(points,new Comparator<Point>(){
			@Override
			public int compare(Point o1, Point o2) {
				// TODO Auto-generated method stub
				return o2.y-o1.y;
			}
			
		});
		System.out.println(Arrays.asList(points));

	}
}
