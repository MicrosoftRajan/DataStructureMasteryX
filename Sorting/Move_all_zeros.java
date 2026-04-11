package Sorting;

public class Move_all_zeros {

    public static void Print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void Move_Zero_End(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int swap = 0;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        Print(arr);
    }

    public static void Move_Zero_end_twoptr_Optimized(int arr[]){
        int s = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
            }
        }
        Print(arr);
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, -2, 3, 0, 4, 8, 0, 10, 12};
        Move_Zero_End(arr);
        Move_Zero_end_twoptr_Optimized(arr);
    }
}
