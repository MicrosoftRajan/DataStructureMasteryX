package MidLevel.Stacks;
import java.util.*;
public class Basics_Stack {

    public static void STL_Stack(){
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push("Rajan");
        st.push("Vidhi");
        st.push("Jowe");
        st.push("Ira");

        System.out.println(st.size());
        System.out.println(st);
        st.pop(); // elements remove

        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the elements and them remove its            
    }

    public static void Traverse_Stack(Stack<String>st){
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void Reverse_Stack(Stack<String> st){
         Stack<String> temp = new Stack<>();
        while (!st.isEmpty()) {
            String top = st.pop();
            temp.push(top);
        }

        while (!temp.isEmpty()) {
            String top = temp.pop();
            System.out.println(top);
            st.push(top);
            
        }
    }

    public static void Get_Element_Specific_Idx(Stack<String> st, int idx){
        Stack<String> st2 = new Stack<>();

        // Edge cases

        if(idx < 0 || idx >= st.size()){
            System.out.println("Invalid Index!");
            return;
        }
        while(st.size() > idx+1){
            st2.push(st.pop());
        }
        System.out.println(st.peek());

        while(st2.size() > 0){
            st.push(st2.pop());
        }
    }


    public static void InsertAtBottom(Stack<String> st, String items){
        if(st.isEmpty()){ // *stack Empty hai to item hei fast and last ele hoga mtb push kare ge
            st.push(items);
            return;
        }
        String top = st.pop(); // *top element ko pop mtlb nikalo
        InsertAtBottom(st, items); // *Recusion Nikalo aur last mai dalo raho
        st.push(top);  // * push karne ka kaam kar raha hai

    }


    public static void Reverse_Stack_Optimize(Stack<String> st){
        if(st.isEmpty()){ // ! agar stack empty hai to return kar do
            return;
        }
        String top = st.pop(); // ! top elements ko nikalo
        Reverse_Stack_Optimize(st); // ! stack mai Push karte Raho
        InsertAtBottom(st, top); // ! Top ko nikal kar bootom mai items ko push kar rha hai

    }
    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("Rajan");
        st.push("Vidhi");
        st.push("Jowe");
        st.push("Ira");
        st.push("Radha MAA");
        st.push("Krishna");
        
        System.out.println("----------------- STACKS LIFO ---------------------------");
        STL_Stack();
        System.out.println("----------------- STACKS  Traverse ---------------------------");
        // Traverse_Stack(st);
        System.out.println("----------------- REVERSE STACK ---------------------------");
        // Reverse_Stack(st);
        System.out.println("----------------- ELEMENT AT SPECIFIC POSITIONS---------------------------");
        System.out.println(st);
        Get_Element_Specific_Idx(st, 0);

        
    }
    
}






/*
EMPTYSTACKEXCEPTION - MEANS That stack does not create



*/