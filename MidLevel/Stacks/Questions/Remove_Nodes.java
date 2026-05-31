package MidLevel.Stacks.Questions;

import java.util.Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Remove_Nodes {

    public static Node removeNodes(Node head) {

        Stack<Node> st = new Stack<>();
        Node temp = head;

        while (temp != null) { 
            while (!st.isEmpty() && st.peek().val < temp.val) {  // agar bada ele mil gya toh small pop kar do
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        temp = null;


        // Node connect kar rahe hai
            while (st.size() > 0) {
                Node top = st.pop();
                top.next = temp;
                temp = top;
            }
            return temp;
    }

    public static void Print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(13);
        Node d = new Node(3);
        Node e = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node ans = removeNodes(a);
        Print(ans);


    }

}
