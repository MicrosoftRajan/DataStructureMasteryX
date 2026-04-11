package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Bubble_sort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Bubble_Sort_Brute(int arr[]) {
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);

        // // 1st Pass
        // for(int i = 0; i<n-1; i++){
        // if(arr[i] > arr[i+1]){
        // int temp = arr[i];
        // arr[i] = arr[i+1];
        // arr[i+1] = temp;
        // }
        // }
        // print(arr);
        // // 2nd Pass
        // for(int i = 0; i<n-1; i++){
        // if(arr[i] > arr[i+1]){
        // int temp = arr[i];
        // arr[i] = arr[i+1];
        // arr[i+1] = temp;
        // }
        // }
        // print(arr);
        // //3rd Pass
        // for(int i = 0; i<n-1; i++){
        // if(arr[i] > arr[i+1]){
        // int temp = arr[i];
        // arr[i] = arr[i+1];
        // arr[i+1] = temp;
        // }
        // }
        // print(arr);
        // //4th Pass
        // for(int i = 0; i<n-1; i++){
        // if(arr[i] > arr[i+1]){
        // int temp = arr[i];
        // arr[i] = arr[i+1];
        // arr[i+1] = temp;
        // }
        // }
        // print(arr);
        // //5th pass
        // for(int i = 0; i<n-1; i++){
        // if(arr[i] > arr[i+1]){
        // int temp = arr[i];
        // arr[i] = arr[i+1];
        // arr[i+1] = temp;
        // }
        // }
        // print(arr);
        // // 6th pass
        // for(int i = 0; i<n-1; i++){
        // if(arr[i] > arr[i+1]){
        // int temp = arr[i];
        // arr[i] = arr[i+1];
        // arr[i+1] = temp;
        // }
        // }
        // print(arr);
    }


    public static void Bubble_Sort_Optimized(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int swap = 0;
            for(int j = 0; j<n-1-i; i++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }

            }
            if(swap == 0) break;
        }
        print(arr);
    }

    public static void Reverse(int arr[]){
        Collections.reverse(Arrays.asList(arr));
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 4, 2, 0 };
         System.out.println("----------------------------------------Org Arrays---------------------------------------------------------");
        print(arr);
         System.out.println("------------------------------Bubble Sort Brute Force Approaches-------------------------------------------");
        Bubble_Sort_Brute(arr);
        System.out.println("------------------------------Bubble Sort Optimized Approaches---------------------------------------------");
        Bubble_Sort_Optimized(arr);
        System.out.println("------------------------------Reverse of Bubble Sort---------------------------------------------");
        Reverse(arr);

    }
}