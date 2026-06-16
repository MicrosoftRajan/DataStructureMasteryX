package MidLevel.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

    public static void Deque(){
        Deque<Integer>dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.getLast());

    }


    public static void main(String[] args) {
        Deque();
        
    }
    
}
