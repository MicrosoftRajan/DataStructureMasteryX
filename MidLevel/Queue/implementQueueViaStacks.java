package MidLevel.Queue;

import java.util.Stack;

class StackQueue {
    Stack<Integer> s1 = new Stack<>();

    Stack<Integer> s2 = new Stack<>();

    void add(int val) {
        s1.push(val);
    }

    int remove() {
        if (s1.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int val = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return val;
    }

    int peek(){
        if(s1.isEmpty()){
            return -1;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int val = s2.peek();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }
}

public class implementQueueViaStacks {

    public static void main(String[] args) {

        StackQueue q = new StackQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.remove());

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.remove());

    }

}
