package MidLevel.Stacks.Questions;
import java.util.*;;
public class Next_Greater_Elements {


    public static int[] Next_Greater(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];

        for(int i = n-1; i>= 0; i--){
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

        int arr[] ={2, 1, 5, 3, 4};

        int[] ans  = Next_Greater(arr);


        for(int x : ans){
            System.out.print(x + " ");
        }
        System.out.println();

        
    }
    
}
