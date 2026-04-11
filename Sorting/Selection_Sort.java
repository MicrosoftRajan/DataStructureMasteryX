package Sorting;

public class Selection_Sort {

    public static void Print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

    public static void Selection_Sort(int arr[]){

        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min = Integer.MAX_VALUE, min_idx = -1;
            for(int j = i; j<n; j++){
                if(arr[j] < min){ // get Min
                    min = arr[j];
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        Print(arr);
    }
    public static void main(String[] args) {
        int arr[] = {8, 4, 1, 9, -3, 5};
        Selection_Sort(arr);
        
    }
}
