package Week2;

import java.util.Stack;

public class backSpaceString {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        String sb = "";
        for (char ch : st)
            sb += ch;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!tt.isEmpty())
                    tt.pop();
            } else {
                tt.push(t.charAt(i));
            }
        }
        String tb = "";
        for (char ch : tt)
            tb += ch;
        return tb.equals(sb);
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}
