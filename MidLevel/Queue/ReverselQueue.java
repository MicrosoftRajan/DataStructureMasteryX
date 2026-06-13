package MidLevel.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverselQueue {

    public static Queue<Integer> ReverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());

        }

        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Original Queue: " + q);

        ReverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }
}
