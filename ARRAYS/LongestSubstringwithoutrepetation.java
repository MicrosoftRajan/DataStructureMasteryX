package ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithoutrepetation {

    public static int LongestSubstring(String str){

        int n = str.length();
        Set<Character>c = new HashSet<>();
        int left = 0, maxlen = 0;

        for(int i = 0; i<n; i++){
            while(c.contains(str.charAt(i))){
                c.remove(str.charAt(left));
                left++;
            }

            c.add(str.charAt(i));
            maxlen = Math.max(maxlen, i-left+1);
        }

        return maxlen;



    }
    public static void main(String[] args) {

        String str = "abcabcbb";
        System.out.println(LongestSubstring(str));
        
    }
}
