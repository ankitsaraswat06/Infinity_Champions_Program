package Week2;

import java.util.Stack;

public class BaseBallGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                st.pop();
            } else if (operations[i].equals("D")) {
                st.push(st.peek() * 2);
            } else if (operations[i].equals("+")) {
                int x2 = st.pop();
                int x1 = st.pop();
                int x3 = x1 + x2;
                st.push(x1);
                st.push(x2);
                st.push(x3);
            } else {
                int k = Integer.parseInt(operations[i]);
                st.push(k);
            }
        }
        int sum = 0;
        while (st.size() > 0) {
            sum += st.pop();
        }
        return sum;

    }

    public static void main(String args[]) {
        String[] ops = { "5", "2", "C", "D", "+" };
        System.out.println(calPoints(ops));
    }
}
