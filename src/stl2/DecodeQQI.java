package stl2;

import java.util.LinkedList;
import java.util.Queue;

public class DecodeQQI {
    public static void main(String[] args) {
        int[] a = new int[]{6, 3, 1, 7, 5, 8, 9, 2, 4};
        Queue<Integer> Q = new LinkedList<Integer>();
        for (int i : a)
            Q.offer(i);
        while (!Q.isEmpty()) {
            System.out.print(Q.peek());
            Q.poll();
            if (Q.isEmpty())
                continue;
            int x = Q.peek();
            Q.poll();
            Q.offer(x);
        }
    }
}
