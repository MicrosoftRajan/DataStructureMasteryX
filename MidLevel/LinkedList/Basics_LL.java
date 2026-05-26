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

    public static void get(int idx) {

        Node temp = head;

        while (idx > 0) {
            temp = temp.Next;
            idx--;
        }
        System.out.println(temp.val);
    }

    public static void Delete(int idx) {

        if (idx < 0 || idx >= size)
            return;
        if (idx == 0)
            DeleteAtHead();
        Node temp = head;

        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.Next;
        }

        temp.Next = temp.Next.Next;
        if (idx == size - 1) {
            tail = temp;
        }
        size--;
    }

    public static Node GetMiddle(Node head) {
        // Node temp = head;
        // int l = 0;

        // while(temp != null){
        // temp= temp.Next;
        // l++;
        // }

        // temp = head;

        // for(int i = 0; i< l/2; i++){
        // temp= temp.Next;
        // }

        // return temp;

        /* Optimize Approched */

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow;
    }

    public static void RemoveMiddleElements(Node head) {

        if (head == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        if (head.Next == null)
            return;
        Node prev = null;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.Next != null) {
            prev = slow;
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        Print(head);
    }

    public static int Kth_Node(Node head, int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= k; i++) {
            if (fast == null)
                return -1;
            fast = fast.Next;
        }

        while (fast != null) {
            slow = slow.Next;
            fast = fast.Next;
        }

        return slow.val;
    }

    public static Node IntersectionNode(Node head1, Node head2) {
        int len1 = 0, len2 = 0;
        Node temp1 = head1, temp2 = head2;

        // length calculate kiya

        while (temp1 != null) {
            temp1 = temp1.Next;
            len1++;
        }

        while (head2 != null) {
            head2 = head2.Next;
            len2++;
        }

        temp1 = head1;
        temp2 = head2;

        if (len1 > len2) { // agar len1 bada hai toh temp ko aage behjo nahi toh temp2
            for (int i = 1; i <= len1 - len2; i++) {
                temp1 = temp1.Next;
            }
        } else {
            for (int i = 1; i <= len2 - len1; i++) {
                temp2 = temp2.Next;
            }
        }

        while (temp1 != temp2) { // after reach to same position start 1 step
            temp1 = temp1.Next;
            temp2 = temp2.Next;
        }
        return temp1;

    }

    public static Node Find(Node head, int val) {
        if (head == null)
            return null;
        if (head.val == val)
            return head;

        return Find(head.Next, val);
    }

    public static Node Swap_LL(Node head, int val1, int val2) {
        Node Node1 = Find(head, val1);
        Node Node2 = Find(head, val2);

        if (Node1 == null || Node2 == null)
            return head;

        // Normal Swap use karo

        int temp = Node1.val;
        Node1.val = Node2.val;
        Node2.val = temp;

        return head;
    }

    public static Node Swap_TwoPtr(Node head, int val) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= val; i++) { // fast ko null tak paucha diya
            fast = fast.Next;
        }

        while (fast != null) { // slow ab exact postion par aa chuka hai
            slow = slow.Next;
            fast = fast.Next;
        }

        fast = head;

        for (int i = 1; i <= val - 1; i++) {
            fast = fast.Next;
        }

        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;

        return head;
    }

    public static boolean DetectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (fast == slow)
                return true;
        }

        return false;
    }

    public static Node RemoveDuplicateLL(Node head) {
        Node temp = head;
        while (head != null && temp.Next != null) {
            if (temp.val == temp.Next.val) { // duplicate element mil gya
                temp.Next = temp.Next.Next;
            } else {
                temp = temp.Next;
            }
        }
        return head;

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
        Node f = new Node(50); // tail

        System.out.println(a.val);

        // Connect Karege (Linking)
        a.Next = b;
        b.Next = c;
        c.Next = d;
        d.Next = e;
        e.Next = null;

        head = a;
        tail = f;
        size = 5;
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

        System.out.println("------------------- Get element at specific position--------------------------");
        AddAtSpecificPosition(90, 2);
        Print(head);
        System.out.println();
        System.out.println("------------------- Get element at specific position--------------------------");
        get(2);
        System.out.println("The size is : " + size);
        System.out.println();

        Node middle = GetMiddle(head);
        System.err.println("The middle element is :" + middle.val);

        System.out.println();

        System.out.println("------------------- Delete the Middle elements--------------------------");

        RemoveMiddleElements(head);
        System.out.println();

        System.out.println("------------------- Kth elements--------------------------");

        System.out.println(Kth_Node(head, 4));
        System.out.println();

        //System.out.println("------------------- Swap Nodes --------------------------");

        // Swap_LL(head, 20, 50);
        // Print(head);
        // System.out.println();

        System.out.println("------------------- Two {Pointer} Swap Nodes --------------------------");

        Swap_TwoPtr(head, 2);

        Print(head);
        System.out.println();
        System.out.println("------------------- Detect Loops --------------------------");
        System.out.println(DetectLoop(head));
        System.out.println();

        System.out.println("------------------- Remove Duplicate --------------------------");

        RemoveDuplicateLL(head);

        Print(head);

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
