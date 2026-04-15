package Sorting;

import java.util.Arrays;

public class Two_Sum {

    public static void Two_Sum_Sols(int arr[], int target){ // O(nlogn) 
        Arrays.sort(arr);
        int s = 0, e = arr.length-1;
        while(s < e){
            if(arr[s] + arr[e] == target){
                System.out.println("Two Sum Found: " + arr[s] + " " + arr[e]);
                s++;
                e--;
            }
            else if(arr[s] + arr[e] < target){
                s++;
            }
            else{
                e--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 0, 4, 3, 2, 8, 10};
        int target = 9;
        Two_Sum_Sols(arr, target);
    }
}
