package STRINGS;

import java.util.Arrays;

import javax.print.DocFlavor.STRING;

public class String_Builders_ {

    public static boolean Anagram(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() != sb2.length())
            return false;
        int[] count = new int[256];
        for (int i = 0; i < sb1.length(); i++) {
            count[sb1.charAt(i)]++;
            count[sb2.charAt(i)]--;
        }
        for (int c : count) {
            if (c != 0)
                return false;
        }
        return true;
    }

    public static void Reverse_StringBuilder(StringBuilder sb) { // two pointer technique
        int lo = 0, hi = sb.length() - 1;
        while (lo <= hi) {
            char temp1 = sb.charAt(lo);
            char temp2 = sb.charAt(hi);

            sb.setCharAt(lo, temp2);
            sb.setCharAt(hi, temp1);
            lo++;
            hi--;
        }
        System.out.println(sb);
    }

    public static void Most_Frequent_character(String str) {
        int n = str.length();
        int max_freq = -1;
        char ans = str.charAt(0);

        for (int i = 0; i < n - 1; i++) {
            int freq = 0;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    freq++;
                }
            }
            if (freq > max_freq) {
                max_freq = freq;
                ans = str.charAt(i);
            } else if (freq == max_freq && str.charAt(i) < ans) {
                ans = str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    // sliding Window Technique - Important

    public static void Most_Frequent_character_Optimize(String str) {

        int n = str.length();
        int max_freq = -1;
        int ans = str.charAt(0);
        char[] arr = str.toCharArray(); // string -> array
        Arrays.sort(arr);
        int i = 0, j = 0;
        while (j < n) {
            if (arr[i] == arr[j])
                j++;
            else {
                int freq = j - i;
                if (freq > max_freq) {
                    max_freq = freq;
                    ans = arr[i];
                }
                i = j;

            }
        }
        int freq = j - i;
        if (freq > max_freq) {
            max_freq = freq;
            ans = arr[i]; 
        }

        System.out.println((char)ans);

    }

    public static void Intern_Method(){
        String str = new String("rajan");
        String str1 = str.intern();
        String str2 = new String("rajan");
        String str3 = "rajan";
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1 == str2.intern());
    }

    public static void String_Buffer(){
        StringBuffer str = new StringBuffer("Tony");
        System.out.println(str);
        str.append("Stark");
        System.out.println(str);
    }

    public static void valid_Parenthesis(String str){
        while(str.contains("{}") || str.contains("()") || str.contains("[]")){
            str = str.replace("()", "")
            .replace("{}", "")
            .replace("()", "");
        }
        System.out.println(str.isEmpty());
    }


    public static void main(String[] args) {

        // string buider have capacity 16 by default and give custom capacity as well
        StringBuilder sb = new StringBuilder("rajan");
        System.out.println(sb);
        sb.append("Yadav");
        System.out.println(sb);
        System.out.println(sb.capacity() + " " + sb.length());

        // Reverse of String Builder
        sb.reverse();
        System.out.println(sb);

        // if we don't have reverse function
        StringBuilder sb2 = new StringBuilder("rajan");
        Reverse_StringBuilder(sb2);

        // Anagram
        StringBuilder sb3 = new StringBuilder("listen");
        StringBuilder sb4 = new StringBuilder("silent");
        System.out.println(Anagram(sb3, sb4));

        // Most Frequent Character
        String s = "testsample";
        // Most_Frequent_character(s);

        // Most Frequent Character Optimize
        Most_Frequent_character_Optimize(s);

        Intern_Method();

        String_Buffer();

        String str = "{}()";
        valid_Parenthesis(str);

    }

}











/* == compares the memory location
    .equals() compares the value
    intern() method is a tool to optimzie memory and esure that all share the same memory refernce in SCP
    String Builder pros: 
    1. thread-safe - No
    2. Faster
    3. Single thread
    String Buffer: 
    Thread Safe - Yes
    Speed - slower
    Multiple thread
    both are use to change in  string*/


    /*
    Sliding Window
    a.fixed k is given
    b.variable k is not given according to question so we can use two pointer
    window Size = R-L+1  */

    /* Lets Vizulize through Rubber Band Method
      [2, 3, 1, 2, 4, 3]
       0  1  2  3. 4. 5
       L. L
       R  R  R  R
       intial 1 window = [2],   sum = 2
       intial 2 window = [2,3],   sum = 5
       intial 3 Window = [2,3,1]  sum = 6
       intial 4 window = [2,3,1,2] sum = 8 valid sum>=7

       Shrink Window 
        New Window = [3, 1, 2] sum = 6
                      L     R
        Expand Window
        intial window = [3, 1, 2, 4] sum = 10 valid
                         L        R
        shrink Window
        New Window = [1, 2, 4] sum = 7 valid
                      L     R 
        shrink window 
        New Window = [2, 4] sum = 6 

        Expand window 
        New Window = [2, 4, 3] sum = 9 Valid

        Shrink Window 
        New Window = [4, 3] sum = 7 valid

        Min length = 2     
       */