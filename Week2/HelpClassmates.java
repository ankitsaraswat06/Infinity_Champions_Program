package Week2;

import java.util.Stack;

public class HelpClassmates {
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty())
                pse[i] = -1;
            else
                pse[i] = arr[st.peek()];

            st.push(i);
        }
        return pse;
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 3, 8, 5, 2, 25 };
        System.out.println(help_classmate(arr, N));
    }
}
