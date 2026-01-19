package Week2;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++)
            st.push(S.charAt(i));
        while (!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "Geeeks";
        System.out.println(reverse(s));
    }
}
