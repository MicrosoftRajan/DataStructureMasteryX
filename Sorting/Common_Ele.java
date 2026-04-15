package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Common_Ele {
    public static void Common_ele_Sols(int arr[], int arr2[]){
        Arrays.sort(arr);
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();

        int s = 0, e = 0;
        while(s < arr.length && e < arr2.length){
            if(arr[s] == arr2[e]){
                ans.add(arr[s]);
                s++;
                e++;
            }
                else if(arr[s] < arr2[e]) s++;
                else e++;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 2, 4};
        int arr2[] = {3, 2, 2, 7};
        Common_ele_Sols(arr, arr2);
    }
}
