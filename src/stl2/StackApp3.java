package stl2;

import java.util.Stack;

public class StackApp3 {
    // 后缀式求值ֵ
    public static void main(String[] args) {
        String[] exp = "1 2 + 3 4 + *".split(" ");
        Stack<Double> S = new Stack<Double>();
        for (String tok : exp) {
            try {
                double x = Double.parseDouble(tok);
                S.push(x);
            } catch (NumberFormatException e) {
                //如果抛出NumberFormatException 说明是tok运算符
                double b = S.peek();
                S.pop();
                double a = S.peek();
                S.pop();
                if (tok.equals("+")) {
                    S.push(a + b);
                } else if (tok.equals("*")) {
                    S.push(a * b);
                }
            }
        }
        System.out.println(S.peek());
    }
}
