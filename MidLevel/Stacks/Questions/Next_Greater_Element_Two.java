package MidLevel.Stacks.Questions;

import java.util.Stack;

public class Next_Greater_Element_Two {




    public static int[] Next_Greater_element_Two(int arr[]){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();


        int ans[] = new int[n];


        for(int i = n-1; i>= 0; i--){
            st.push(arr[i]);
        }


        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){

                st.pop();

            }

            if(st.isEmpty()){
                ans[i] = -1;
            }

            else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1};

        int[] ans = Next_Greater_element_Two(nums);
        for(int x : ans){
            System.out.print(x + " ");
        }
        System.out.println();
        
    }
    
}
