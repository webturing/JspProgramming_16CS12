package stl;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DoubleColoredBall {
    public static void main(String[] args) {

        Vector<Integer> balls = new Vector<>();
        for (int i = 1; i <= 35; i++) {
            balls.add(i);


        }
        System.out.println(balls);
        Collections.shuffle(balls);
        System.out.println(balls);
        Vector<Integer> prize = new Vector<>();
        for (int i = 0; i < 6; i++) {
            prize.add(balls.get(i));
        }
        System.out.println(prize);
        while (true) {
            Collections.shuffle(balls);
            List<Integer> a = balls.subList(0, 6);
            if (prize.equals(a)) {
                System.out.println("$5000000");
                break;
            }

        }

    }
}
