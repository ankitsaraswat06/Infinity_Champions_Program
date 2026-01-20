package Week2;

import java.util.*;

public class DeleteMidStack {
    public static void deleteMid(Stack<Integer> s) {
        int del = s.size() - (int) Math.floor((s.size() + 1) / 2);
        Stack<Integer> st = new Stack<>();
        while (del-- > 0) {
            st.push(s.pop());
        }
        s.pop();
        while (!st.isEmpty())
            s.push(st.pop());
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        deleteMid(st);
        System.out.println(st);

    }
}
