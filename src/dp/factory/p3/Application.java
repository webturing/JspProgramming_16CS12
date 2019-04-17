package dp.lec12.factory.p3;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
public class Application {
	public static void main(String args[]) {
		Collection<Integer> mylist = new LinkedList<Integer>();
		for (int i = 1; i < 10; i++) {
			mylist.add(new Integer(i));
		}
		Iterator<Integer> iter = mylist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
