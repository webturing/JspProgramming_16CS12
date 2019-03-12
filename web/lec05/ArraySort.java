import java.util.Arrays;
import java.util.Comparator;

class Point implements Comparable<Point> {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d,%d)", x, y);
	}

	@Override
	public int compareTo(Point that) {
		return this.x - that.x;
	}
}

public class ArraySort {
	public static void main(String[] args) {
		Point[] points = new Point[10];
		System.out.println(Arrays.toString(points));
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point((int) (100 * Math.random()),
					(int) (100 * Math.random()));
		}
		System.out.println(Arrays.toString(points));
		Arrays.sort(points);
		System.out.println(Arrays.toString(points));
		Arrays.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				// TODO Auto-generated method stub
				return o1.y - o2.y;
			}
		});
		System.out.println(Arrays.toString(points));
	}
}
