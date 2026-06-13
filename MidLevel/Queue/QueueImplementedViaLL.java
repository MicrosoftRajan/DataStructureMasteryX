package MidLevel.Queue;


class Node{

    int data;

    Node nxt;


    Node(int data){
        this.data = data;

    }
}


class Queue{
    Node front = null, rear = null;


    void add(int val){
        Node temp = new Node(val);


        if(front == null){
            front = rear = temp;
            return;
        }
        rear.nxt = temp;
        rear = temp;
    }

    int remove(){
        if(front == null){
            System.out.println("Queue Underflow");
            front = rear = null;
            return -1;
        }

        int val = front.data;
        front = front.nxt;
        return val;
    }


    int peek(){
        if(front == null){
            System.out.println("Queue is Empty!");
            return -1;
        }

        return front.data;
    }
    void Display(){
        Node temp = front;

        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.nxt;
        }
        System.out.println("null");
    }

}



public class QueueImplementedViaLL {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        System.out.println(q.peek());
        q.Display();
        System.out.println(q.remove());
        q.Display();

    }
    
}
