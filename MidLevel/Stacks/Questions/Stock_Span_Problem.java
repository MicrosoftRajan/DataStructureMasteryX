package MidLevel.Stacks.Questions;

import java.util.Stack;

public class Stock_Span_Problem {

    public static int[] Stock_Span(int arr[]){

        int n = arr.length;


        int [] span = new int[n];

        Stack<Integer> st = new Stack<>();


        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                span[i] = i+1; 
            }

            else{
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        return span;



    }


    public static void main(String[] args) {

        int arr[] = {100, 80, 60, 70, 90, 75};
        //          *[1, 1, 1, 2, 4, 1]

        int[] ans = Stock_Span(arr);

        for(int x: ans){
            System.out.print(x + " ");
        }
        System.out.println();
        
    }
    
}
