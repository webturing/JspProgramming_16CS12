package stl2;

import java.util.Stack;

//栈实现进制转化 6（10）=110（2）
public class StackApp1 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Integer.toBinaryString(n));

        Stack<Integer> S = new Stack<>();
        while (n > 0) {
            S.push(n % 2);//push
            n /= 2;
        }
        while (!S.isEmpty()) {
            System.out.print(S.peek());//top()
            S.pop();//pop
        }
        System.out.println();


    }

}
