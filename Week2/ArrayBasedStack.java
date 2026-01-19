package Week2;

public class ArrayBasedStack {
    int[] arr;
    int top;
    int size;

    ArrayBasedStack() {
        arr = new int[10];
        top = -1;
        size = 0;
    }

    void push(int el) {
        if (top == arr.length - 1) {
            throw new UnsupportedOperationException("OverFlow");
        }
        top++;
        arr[top] = el;
        size++;
    }

    int pop() {
        if (top == -1)
            throw new UnsupportedOperationException("Underflow");
        int el = arr[top];
        top--;
        size--;
        return el;
    }

    int peek() {
        if (top == -1)
            throw new UnsupportedOperationException("Stack empty");
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String args[]) {
        ArrayBasedStack st = new ArrayBasedStack();
        st.push(30);
        st.push(40);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

}
