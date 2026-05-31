package MidLevel.Stacks;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyStack {
    Node head;
    int size;

    int peek() {
        if (head == null) {
            System.out.println("UnderFLow!");
            return -1;
        }
        return head.val;
    }

    int pop() {

        if (head == null) {
            System.out.println("UnderFLow!");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    void push(int ele) {
        Node temp = new Node(ele);
        if (size == 0)
            head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    int size() {
        return size;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

}

public class ImplementLL_Stack {

    public static void main(String[] args) {
        
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
    }

}
