package MidLevel.LinkedList;

class Node { // data Type
    int val;
    Node Next; // default val is null

    // constructor
    Node(int val) {
        this.val = val;
    }
}

public class Basics_LL {

    public static void Print(Node head) {

        // Node temp = head;
        // // while tab use hota hai jab hame itrations ka pta na ho par yeh pta ho ki
        // loop brak kab hoga
        // while(temp != null){
        // System.out.print(temp.val + " -> ");
        // temp = temp.Next;
        // }
        // System.out.println("NULL");

        // Recursion Method
        if (head == null)
            return;
        System.out.print(head.val + " ");
        Print(head.Next);

    }

    public static void Reverse_LL(Node head) {
        if (head == null)
            return;
        Reverse_LL(head.Next);
        System.out.print(head.val + " ");
    }

    public static void get(Node head, int idx) {
        // Node temp = head;
        // int i = 0;

        // while(temp != null){
        // if(i == idx){
        // System.out.println(temp.val);
        // return;
        // }
        // temp = temp.Next;
        // i++;
        // }

        // Recursion
        if (head == null)
            return;

        if (idx == 0) {
            System.out.print(head.val);
            return;
        }
        get(head.Next, idx - 1);

    }

    static Node head = null;
    static Node tail = null;
    static int size;

    public static void AddatTail(int val) {

        Node temp = new Node(val);
        if (tail == null)
            head = tail = temp;
        else {
            tail.Next = temp;
            tail = temp;
        }
        size++;
    }

    public static void AddAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.Next = head;
            head = temp;
        }
        size++;
    }

    public static void DeleteAtHead() {
        if (head == null) {
            System.out.println("LL Is Empty");
        }
        head = head.Next;
        if (head == null) {
            tail = null;

        }
        size--;

    }

    public static void AddAtSpecificPosition(int val, int idx) {

        if (idx < 0 || idx > size) {
            return;
        }

        if (idx == 0) {
            AddAtHead(val);
            return;
        }

        if (idx == size) {
            AddatTail(val);
            return;
        }

        Node temp = head;

        // idx-1 position tak jao
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.Next;
        }

        Node newNode = new Node(val);

        // Correct Linking
        newNode.Next = temp.Next;
        temp.Next = newNode;

        size++;
    }

    public static void get(int idx){

        Node temp = head;

        while (idx > 0) {
            temp = temp.Next;
            idx--;
        }
        System.out.println(temp.val);
    }
    public static void main(String[] args) {

        // Node a = new Node();
        // a.val = 10;
        // Node b = new Node();
        // b.val = 20;
        // Node c = new Node();
        // c.val = 30;
        // Node d = new Node();
        // d.val = 40;
        // Node e = new Node();
        // e.val = 50;

        Node a = new Node(10); // Node@251a69d7. // head
        Node b = new Node(20); // Node@7344699f
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50); // tail

        System.out.println(a.val);

        // Connect Karege (Linking)
        a.Next = b;
        b.Next = c;
        c.Next = d;
        d.Next = e;
        e.Next = null;

        head = a;
        tail = e;
        size = 50;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a.Next); // a->b
        // System.out.println(c);
        // System.out.println(b.Next); // b -> c
        // System.out.println(a.Next.Next);
        // System.out.println(a.Next.Next.Next.val);

        // Travel LL

        System.out.println("--------------------------- Treverse LL --------------------------");
        Print(a);
        System.out.println(" ");
        // Reverse
        System.out.println("--------------------------- Reverse LL --------------------------");
        Reverse_LL(a);
        System.out.println();

        System.out.println("--------------------------- Get LL --------------------------");
        get(a, 2);
        System.out.println("-------------------------- Add element at tail LL --------------------------");
        AddatTail(60);
        Print(a);
        System.out.println();
        System.out.println("-------------------------- Add element at tail LL --------------------------");
        AddAtHead(90);
        Print(head);
        System.out.println();

        System.out.println("-------------------------- Delete At Head--------------------------");
        DeleteAtHead();
        Print(head);
        System.out.println();

        System.out.println("------------------- Add element at specific position--------------------------");
        AddAtSpecificPosition(90, 2);
        Print(head);
        System.out.println();
        System.out.println("------------------- Get element at specific position--------------------------");
        get(2);
        System.out.println("The size is : "+ size);

        
    }

}

/*
 * Linked List consists of two things
 * a) Data
 * b) add of next Node
 * -----------
 * | | | ->
 * |____|______|
 * Data | Address(hexa decimals)
 * also create own Data Type
 * null means end of Node
 * you can't go back to previous Node
 * Travese all the Node - DrawBack
 * 
 */
