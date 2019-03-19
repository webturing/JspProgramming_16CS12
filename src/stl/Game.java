package stl;

import java.util.LinkedList;

public class Game {
	static final int N =  13;

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = N; i >= 1; i--) {
			if (list.size() > 1) {
				list.addFirst(list.pollLast());
			}
			list.addFirst(i);
		}
		System.out.println(list);
//����
		while (!list.isEmpty()) {
			System.out.println(list.pollFirst());
			if (list.size()>1) {
				list.add(list.pollFirst());
			}

		}

	}
}
