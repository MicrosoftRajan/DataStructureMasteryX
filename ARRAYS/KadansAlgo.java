package ARRAYS;

public class KadansAlgo {

    public static int KadanesAlgoritm(int arr[]){
        int curr_sum = arr[0];
        int max_sum = arr[0];
        int n = arr.length;
        for(int i = 0; i<n; i++){
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;

    }

    public static void main(String[] args) {

             int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
             System.out.println(KadanesAlgoritm(arr));
        
    }
}