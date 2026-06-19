package MidLevel.BinaryTree;
import java.util.*;

class Node {
    int val;

    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

}

public class BinaryTreeImplementation {

    /*
     * 3
     * / \
     * 4 2
     * / \ / \
     * -1 1 6 9
     */

    public static void display(Node root) { // PreOrder

        if (root == null)
            return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static int size(Node root){

        if(root == null) return 0;
        int leftSize = size(root.left);
        int rightSize = size(root.right);

        return 1 + leftSize + rightSize;

    }

    public static int sum(Node root){
        if(root == null) return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return root.val + leftSum + rightSum;

    }

        public static int product(Node root){
        if(root == null) return 1;

        int leftProduct = product(root.left);
        int rightProduct = product(root.right);

        if( root.val == 0 || root.val <= 0){
            return leftProduct * rightProduct;
        }

        return root.val * leftProduct * rightProduct;

    }

    public static int Max(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(Max(root.left),Max(root.right)));
    }

        public static int Min(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val, Math.min(Min(root.left),Min(root.right)));
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        // Connection
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        display(a);
        System.out.println();
        System.out.println("Size of BT is : " + size(a));
        System.out.println("Sum of BT is : " + sum(a));
        System.out.println("Product of Non Zero BT is : " + product(a));
        System.out.println("Max BT is : " + Max(a));
        System.out.println("Min BT is : " + Min(a));
    }

}
