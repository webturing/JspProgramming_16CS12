package stl2;

import java.util.Deque;
import java.util.LinkedList;

public class DeCodeQQII {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 8, 7, 9, 10, 11, 12, 13};
        Deque<Integer> Q = new LinkedList<Integer>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (!Q.isEmpty()) {
                int last = Q.getLast();
                Q.pollLast();
                Q.addFirst(last);
            }
            Q.addFirst(a[i]);
        }
        System.out.println(Q);
    }
}
