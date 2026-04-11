package ARRAYS;

public class ReverseArrays {

    public static void Reverse(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.err.print(arr[i]+" ");
        }
        Reverse(arr);

        for(int i = 0; i<n; i++){
            System.err.print(arr[i]+" ");
        }
    }
    
}
