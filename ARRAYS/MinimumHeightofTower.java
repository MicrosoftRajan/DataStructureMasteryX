package ARRAYS;

import java.util.Arrays;

public class MinimumHeightofTower {

    public static int MininmumHeightTower(int arr[], int k) {
        Arrays.sort(arr);
        int n = arr.length;

        int intial_diff = arr[n - 1] - arr[0];

        int expand = arr[0] + k;
        int shrink = arr[n - 1] - k;

        for (int i = 0; i < n-1; i++) {
            int min_val = Math.min(expand, arr[i+1] - k);
            int max_val = Math.max(shrink, arr[i] + k);

            // make sure value is not negative
            if (min_val < 0)
                continue;

            intial_diff = Math.min(intial_diff, max_val - min_val);
        }

        return intial_diff;

    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println(MininmumHeightTower(arr, k));

    }
}
