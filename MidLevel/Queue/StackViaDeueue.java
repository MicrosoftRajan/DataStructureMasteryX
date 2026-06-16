package MidLevel.Queue;
import java.util.*;

class Stack{
    Deque<Integer> dq;

    public Stack(){
        dq = new LinkedList<>();
    }

    public void push(int x){
        dq.addLast(x);
    }

    public int pop(){
        if(dq.isEmpty()){
            System.out.println("Stack UnderFlow!!");
            return -1;
        }
        return dq.removeLast();
    }

    public int peek(){
         if (dq.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return dq.getLast();
    }

    public boolean isEmpty(){
        return dq.isEmpty();
    }

    public void display(){
        System.out.println(dq);
    }
}

public class StackViaDeueue {

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);

        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
    
    
}
