package Week2;

public class LLBasedStack {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    LLBasedStack() {
        head = new Node(-1);
        size = 0;
    }

    void push(int el) {
        Node nn = new Node(el);
        nn.next = head;
        head = nn;
        size++;
    }

    int pop() {
        if (size == 0)
            throw new UnsupportedOperationException("Empty stack");
        int el = head.val;
        head = head.next;
        return el;
    }

    int peek() {
        if (size == 0)
            throw new UnsupportedOperationException("Empty stack");
        return head.val;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public static void main(String args[]) {
        LLBasedStack st = new LLBasedStack();
        st.push(30);
        st.push(30);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println(st.peek());
    }
}
