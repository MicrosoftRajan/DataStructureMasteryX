package ARRAYS;

public class SumArrays {

    public static void SlidingWindowSum(int arr[], int k){ // k -> window size
        int n = arr.length;
        int sum  = 0;
        // First Window
        for(int i = 0; i<k; i++){
            sum+= arr[i];
        }

        int max_sum = sum;

        // Slide logic
        
        for(int i = k; i<n;i++){
            sum = sum + arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, sum);
        }

        System.out.println(max_sum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        SlidingWindowSum(arr, 3);

    }
}