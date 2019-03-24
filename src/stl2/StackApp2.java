package stl2;

import java.util.Stack;

//括号配对检测
public class StackApp2 {
    public static void main(String[] args) {
        System.out.println(false == check(")"));
        System.out.println(true == check("()"));
        System.out.println(true == check("(())"));
        System.out.println(true == check("()()"));
        System.out.println(true == check(""));

    }

    private static boolean check(String s) {
        Stack<Character> S = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                S.push(c);
            } else if (c == ')') {
                if (S.isEmpty() || S.peek() != '(')
                    return false;
                S.pop();
            }
        }
        return S.isEmpty();
    }

}
