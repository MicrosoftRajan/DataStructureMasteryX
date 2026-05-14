package ProblemsSet;

public class palindrome_ {

    public static void is_Palindrome(String str) {
        int r = str.length() - 1;
        int l = 0;

        while (l <= r) {
            if (str.charAt(l) != str.charAt(r))
                System.out.println("it is not a palidrome");
            l++;
            r--;

        }
        System.out.println("it is a palidrome");

    }

    public static void main(String[] args) {
        String s = "naman";
        is_Palindrome(s);

    }

}
