package stl2;

import java.util.PriorityQueue;

public class HeapApp {
    //小明搬果子
    public static void main(String[] args) {
        int[] a = {1, 2, 9};
        // PriorityQueue<Integer> Q=new
        // PriorityQueue(4,Collections.reverseOrder());//maxheap
        PriorityQueue<Integer> Q = new PriorityQueue<Integer>();//minheap
        for (int i : a)
            Q.add(i);
        int tot = 0;
        while (Q.size() > 1) {
            int x = Q.peek();
            Q.poll();
            int y = Q.peek();
            Q.poll();
            tot += x + y;
            Q.offer(x + y);
        }
        System.out.println(tot);
    }
}
