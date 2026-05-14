package STRINGS;

public class CodeStr {

    public static void Count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void Palindrome(String str) {
        int lo = 0, hi = str.length() - 1;
        while (lo <= hi) {
            if (str.charAt(lo) != str.charAt(hi)) {
                System.out.println("Not a palindrome");
                return;
            }
            lo++;
            hi--;
        }
        System.out.println("Is a palindrome");
    }

    public static void String_Immutable() {
        String s = "Rajan";
        System.out.println(s);

        // if I want to Rujan
        // s = s.substring(0,1)+"u"+s.substring(2);
        // System.out.println(s);

        String s2 = "Rajan";
        System.out.println(s2);

        // with NEW Keyword

        String s3 = new String("Rajan");
        System.out.println(s3);

        if (s == s2) {
            System.out.println("Same reference");
        } else {
            System.out.println("Different reference");
        }

        if (s == s3) {
            System.out.println("Same reference");
        } else {
            System.out.println("Different reference");
        }

    }

    public static void Print_SubStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int SumSubString(String str) {
        int sum = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String subStr = str.substring(i, j);
                System.out.println(subStr);
                sum += Integer.parseInt(subStr);
            }
            System.out.println();

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------- COUNT VOWELS --------------------------------");
        String str = "hello world";
        Count_Vowels(str);
        System.out.println("-------------------------------- PALINDROME --------------------------------");
        String str2 = "madam";
        Palindrome(str2);
        System.out.println("-------------------------------- SUBSTRINGS --------------------------------");
        String str3 = "rajan";
        Print_SubStrings(str3);
        System.out.println("-------------------------------- SUM OF SUBSTRINGS --------------------------------");
        String str4 = "123";
        System.out.println(SumSubString(str4));

        System.out.println("-------------------------------- STRING IMMUTABLE --------------------------------");
        String_Immutable();
    }
}
