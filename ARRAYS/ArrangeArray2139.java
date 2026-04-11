package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangeArray2139 {
    public static int[] rearrange(int arrs[]) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();


        for(int arr: arrs){
            if(arr > 0){
                pos.add(arr);
            } else{
                neg.add(arr);
            }
        }

        // Merge the res
        int res[] = new int[arrs.length];
        
        int i=0, j=0, k=0;

        while(i<pos.size() && i<neg.size()){
            res[k++] = pos.get(i++); // pos first
            res[k++] = neg.get(j++); // pos first
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] res = rearrange(nums);
        System.out.println(Arrays.toString(res));
    }
}
