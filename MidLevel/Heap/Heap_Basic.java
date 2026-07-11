package MidLevel.Heap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Basic {

    public static void display(PriorityQueue<Integer> pq) {

        for (int ele : pq) {
            System.out.print(ele + " ");
        }

    }

    public static void KthSortestElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                pq.remove();
            }

        }

        System.out.println(pq.peek());

    }

    public static void NearlySorted(int arr[], int k) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                arr[idx++] = pq.remove();
            }
        }

        while (!pq.isEmpty()) {
            arr[idx++] = pq.remove();
        }

        System.err.println(Arrays.toString(arr));
    }

    public static void MinCostRope(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ele : arr) {
            pq.add(ele);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();

            int sum = first + second;

            cost+= sum;

            pq.add(sum);
        }

        System.out.print("Minimum Cost of Rope is : "+ cost);
    }


    public static int[][] k_ClosestPoint_Origin(int arr[][], int k){
        // K smallest distance -> Max Heap

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> b[0] - a[0]
        );


        for(int ele[]: arr){
            int x = ele[0];
            int y = ele[1];

            int dist = x*x+y*y;
            pq.add(new int[]{dist,x,y});

            if(pq.size() > k){
                pq.remove();
            }
        }


        int ans[][] = new int[k][2];
        int i = 0;

        while(!pq.isEmpty()){

        int temp[] = pq.remove();
        ans[i][0] = temp[1];
        ans[i][1] = temp[2];
        i++;
        }

        return ans;

    }
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);

        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        display(pq);

        System.out.println();

        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        KthSortestElement(arr, k);

        System.out.println();

        int arr1[] = { 6, 5, 3, 2, 8, 9 };
        int k1 = 3;
        NearlySorted(arr1, k1);

        System.out.println();

        int arr2[] = {4,2,7,6,9};
        MinCostRope(arr2);

        System.out.println();

          int[][] points = {
                {1, 3},
                {-2, 2},
                {5, 8},
                {0, 1}
        };

        int[][] ans = k_ClosestPoint_Origin(points, 2);

        for (int[] p : ans) {
            System.out.print(Arrays.toString(p)+ " ");
        }

    }

}
