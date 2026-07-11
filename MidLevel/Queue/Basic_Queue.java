package MidLevel.Queue;

import java.util.*;
import java.util.Queue;

public class Basic_Queue {

    public static void Travse_Queue(Queue<Integer> q) {
        int n = q.size();

        // while(!q.isEmpty()){
        // System.out.print(q.peek()+" ");
        // q.remove();
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());

        }
    }

    public static void Add_Element_At_Specific_Idx(Queue<Integer> q, int idx, int val) {

        if (idx < 0 || idx > q.size()) {
            System.out.println("Invalid Index!");
            return;
        }

        int n = q.size(); // queue ka size store

        if (idx > n) {

            for (int i = 1; i <= idx; i++) { // travse queue par kar raha remove and add
                q.add(q.remove());
            }
        }

        q.add(val); // add specific value ko

        for (int i = 1; i <= n - idx; i++) { // n - idx remaining element in front queue
            q.add(q.remove());

        }

    }

    public static void peekAtIndex(Queue<Integer> q, int idx) {

        if (idx < 0 || idx >= q.size()) {
            System.out.println("Queue UnderFlow!!");
        }
        int n = q.size();

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        System.out.println(q.peek());

        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }

    public static void removeAtIndex(Queue<Integer> q, int idx) {

        if (idx < 0 || idx >= q.size()) {
            System.out.println("Invalid Index");
            return;
        }

        int n = q.size();
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        System.out.println(q.remove());

        for (int i = 0; i < n - idx - 1; i++) {
            q.add(q.remove());
        }
    }

    public static void Basic_Oprations() {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        q.remove();

        System.out.println(q);
        System.out.println(q.size());
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        // Travse_Queue(q);
        // System.out.println();
        // Basic_Oprations();
        Add_Element_At_Specific_Idx(q, 2, 99);
        Travse_Queue(q);
        System.out.println();
        peekAtIndex(q, 2);
        System.out.println();
        removeAtIndex(q, 0);
        System.out.println();
        Travse_Queue(q);

    }

}

/*
 * Queue work on FIFO Model
 * 
 * Vizulazation of queue
 * ----------------------
 * Front Rear
 * ----------------------
 * 
 * Rear - add() - always from Rear
 * Front Remove peek(), pop() - always work
 */
