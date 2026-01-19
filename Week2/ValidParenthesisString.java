package Week2;

import java.util.Stack;

public class ValidParenthesisString {

    // optimized method using maxOpen and minOpen
    public static boolean isValidOptimized(String s) {
        int minOpen = 0;
        int maxOpen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                minOpen++;
                maxOpen++;
            } else if (s.charAt(i) == ')') {
                minOpen--;
                maxOpen--;
            } else {
                minOpen--;
                maxOpen++;
            }
            if (minOpen < 0)
                minOpen = 0;
            if (maxOpen < 0)
                return false;
        }
        return minOpen == 0;
    }

    // Using two stacks standard method

    public static boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ast = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                st.push(i);
            else if (ch == '*')
                ast.push(i);
            else {
                if (!st.isEmpty()) {
                    st.pop();
                } else if (!ast.isEmpty()) {
                    ast.pop();
                } else {
                    return false;
                }
            }

        }
        while (!st.isEmpty() && !ast.isEmpty()) {
            if (st.peek() > ast.peek()) {
                return false;
            }
            st.pop();
            ast.pop();
        }
        return st.size() == 0;
    }

    public static void main(String args[]) {
        String s = "(*))";
        System.out.println(isValid(s));
    }
}
