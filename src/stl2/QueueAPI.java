package stl2;

import java.util.LinkedList;
import java.util.Queue;


public class QueueAPI {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            Q.offer(i);
            System.out.println(Q);
        }
        while (!Q.isEmpty()) {
            System.out.print(Q.peek());
            Q.poll();
        }
    }
}
