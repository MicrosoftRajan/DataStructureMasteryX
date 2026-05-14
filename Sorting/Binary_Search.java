package Sorting;

public class Binary_Search {

    public static int Binary_Search_Sols(int arr[], int target){
        int i = 0, j = arr.length - 1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) i = mid + 1;
            else j = mid - 1; 
        }
        return -1;

    }

    public static void Recurrence_Binary_Search_Sols(int arr[], int tar){
        int lo = 0, hi = arr.length - 1, idx = -1;

        while(lo <= hi){
            int mid  = lo + (hi - lo) /2;
            if(arr[mid] < tar) lo = mid + 1; // right side
            else if(arr[mid] > tar) hi = mid - 1; // left side
            else{
                idx = mid;
                hi = mid - 1;
            }
        }
        System.out.println(idx);
    }

    public static void Last_Occurrence_Binary_Search(int arr[], int tar){
        int lo = 0, hi = arr.length - 1, idx = -1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] < tar) lo = mid + 1;
            else if(arr[mid] > tar) hi = mid -1;
            else{
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.println(idx);
    }

    public static void Desc_Order_Arrays(int arr[], int target){
        int lo = 0, hi = arr.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] < target)  hi = mid - 1;
            else if(arr[mid] > target) lo = mid + 1;
            else {
                System.out.println(mid);
                return;
            }
        }
    }

    public static void printMountainArray(int arr[]){
        int lo = 1, hi = arr.length - 2;

        while (lo <= hi){
            int mid =  lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){ // increasing stage
                System.out.println(mid);
                return;
            }
            else if (arr [mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){ // decreasing stage
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    }

    public static void Floor_Sorted_Array(int arr[], int x){
        int lo = 0, hi = arr.length - 1, idx = -1;

        while (lo <= hi){
            int mid = (hi+lo) / 2;
            if (arr[mid] > x){
                hi = mid - 1;
            } else{
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.println(idx);
    }

    public static void Max_Count(int arr[]){
        int lo = 0, hi = arr.length - 1, idx = -1;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] >= 0){ 
            idx = mid; 
            hi = mid - 1;
            }
            else lo = mid + 1;
        }
        int i  = idx;
        int neg = i;
        while(i < arr.length && arr[i] == 0){
            i++;
        }
        int pos = arr.length - i;
        System.out.println(Math.max(neg, pos));

    }

    public static void floor_Sqrt(int n){
        // int root = 0;

        // for (int i =0; i<n; i++){
        //     if(i * i > n) break;
        //     root = i;
        // }
        // System.out.println(root);
        int lo = 1, hi  = n;
        while (lo <= hi){
            int mid = (lo+hi) / 2;
            if(mid * mid == n){
                System.out.println(mid);
                return;
            }
            else if(mid * mid > n){
                hi = mid - 1;
            } else{
                lo = mid + 1;
            }
        }
        System.out.println(hi);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println(Binary_Search_Sols(arr, target));

        System.out.println("---------------- Recurrence Binary Search----------------");
        int new_arr[] = {1,2,2,2,3,4,5,5,5,6,7,7,7,8,9};
        int tar = 7;
        Recurrence_Binary_Search_Sols(new_arr, tar);

        System.out.println("---------------- Last Occurrence Binary Search----------------");
        Last_Occurrence_Binary_Search(new_arr, tar);

        System.out.println("---------------- Descending Order Binary Search----------------");
            int desc_arr[] = {9,8,7,6,5,4,3,2,1};
            int target2 = 2;
            Desc_Order_Arrays(desc_arr, target2);

        System.out.println("---------------- Mountain Array Search----------------");
            int mountain_arr[] = {-1, 0, 1, 2, 5, 6, 8, 6, 3};
            printMountainArray(mountain_arr);

        System.out.println("---------------- Floor of a Sorted Array----------------");
            int floor_arr[] = {1, 2, 4, 10, 10, 12, 19};
            int x = 5;
            Floor_Sorted_Array(floor_arr, x);
        System.out.println("---------------- Max Count of Negatives or Positives----------------");
            int count_arr[] = {-3, -2, -1, 0, 0, 1, 2, 3};
            Max_Count(count_arr);

        System.out.println("---------------- Floor of Square Root----------------");
            floor_Sqrt(15);
    }
}
