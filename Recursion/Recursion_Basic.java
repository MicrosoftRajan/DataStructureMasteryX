package Recursion;

public class Recursion_Basic {
    public static void ajay(int n) {
        if (n == 10)
            return;
        System.out.println("priya");
        ajay(n + 1);
    }

    public static void Print_N_To_One(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        Print_N_To_One(n - 1);
    }

    public static void One_to_N(int x, int n) {
        if (x > n)
            return;
        System.out.println(x);
        One_to_N(x + 1, n);
    }

    public static void Increasing_Decreasing(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        Increasing_Decreasing(n - 1);
        if (n != 1)
            System.out.print(n + " ");
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * Factorial(n - 1);
    }

    public static int Power(int a, int b) { // a^b
        if (b == 0)
            return 1;

        // Negative Power
        if (b < 0)
            return 1 / Power(a, -b);

        return a * Power(a, b - 1);
    }

    public static void Reverse_Number(int n) {
        int rev = 0;
        while (n != 0) {
            rev *= 10;
            rev += (n % 10);
            n /= 10;
        }
        System.out.println(rev);

    }

    public static int Reverse_recursion(int n, int r) {
        if (n == 0)
            return r;
        return Reverse_recursion(n / 10, r * 10 + n % 10);
    }

    public static int FirstNNatural(int n) {
        if (n == 0)
            return 0;
        return n + FirstNNatural(n - 1);
    }

    public static void HCF(int a, int b) {
        int hcf = 1; // worst case

        for (int i = 2; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }

    public static int HCF_Recursion(int a, int b) {
        if (a == 0)
            return b;
        return HCF_Recursion(b % a, a);
    }

    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }

    public static int stairs(int n) {
        if (n == 1 || n == 2)
            return n;
        return stairs(n - 1) + stairs(n - 2);
    }


    public static int Fist_Occurence(int arr[], int key, int i){
         if(i == arr.length) return -1;
         if(arr[i] == key) return i; // middle element
         return Fist_Occurence(arr, key, i+1);
    }

        public static int Last_Occurence(int arr[], int key, int i){
        // array at the end 
         if(i == arr.length) return -1;
         // phele baaki arrays mai search karo
         int is_found = Last_Occurence(arr, key, i+1);

         // phele aage wale mai search karo baki agar waha mil gya toh woh last hoga nahi current idx check karo

         if(is_found != -1 && arr[i] == key) return i;
        
         // agar dono mai nhi mila toh -1 return kar do 
         return -1;
    }


    public static int Tile_Pairs(int n)
    {
        if( n == 0 || n == 1) return 1;
        return Tile_Pairs(n-1) + Tile_Pairs(n-2);
               // Horizontal     // Vertical
    }

    public static void Remove_Duplicate(String str, int idx, StringBuilder sb, boolean map[]){
       
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        char currchar = str.charAt(idx);

        // skip character 
        if(map[currchar - 'a'] == true){
            Remove_Duplicate(str, idx+1, sb, map);
        }else{
            map[currchar-'a'] = true;
            Remove_Duplicate(str, idx+1, sb.append(currchar), map);
        }
    }

    public static int Pair_Friend(int ways){
        if(ways == 1 || ways == 2) return ways;
        return Pair_Friend(ways-1) + (ways - 1) * Pair_Friend(ways-2);

    }
    public static void main(String[] args) {
        ajay(2);
        Print_N_To_One(5);
        System.out.println("Increase AND DECR  EASING");
        Increasing_Decreasing(8);
        System.out.println("Factorial");
        System.out.println(Factorial(5));
        System.out.println("Power");
        System.out.println(Power(2, 4));
        System.out.println("Reverse");
        Reverse_Number(8997);
        System.out.println("Reverse Recursion");
        System.out.println(Reverse_recursion(1238, 0));
        System.out.println("First N Natural Number"); // O(1)
        System.out.println(FirstNNatural(8));
        System.out.println("HCF"); // O(1)
        HCF(12, 16);

        System.out.println("HCF Recursion"); // O(1)
        System.out.println(HCF_Recursion(12, 16));
        System.out.println("Fibonacci"); // O(1)
        System.out.print(Factorial(5) + " ");

         System.out.println("Stairs"); // O(1)
        System.out.print(stairs(5) + " ");
        System.out.println();

        System.out.println("First Occurrences"); 
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(Fist_Occurence(arr, 5, 0));

        System.out.println("Last Occurrences"); 
        int arr1[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(Last_Occurence(arr1, 5, 0));

        System.out.println("Tile Problem");
        System.out.print(Tile_Pairs(4));

        System.out.println("Duplicate String");

        String str = "apnacollege" ;
        Remove_Duplicate(str, 0, new StringBuilder(""), new boolean[26]) ;

        System.out.println("Friend Pairing");
        System.out.println(Pair_Friend(4));



    }
}

/*
 * Recursion Notes
 * 1. local preference is high >>>> Global
 * base case work call work
 * 
 * DRY RUN OF FACTORIAL CODE
 * 
 * int n = 5
 * 
 * n * (n-1)
 * 5 * 4 3 2 1
 * 
 * Cons
 * for loop >>>> Recusive loop
 * calc space complexity
 * 
 * no of parameter * no of calls
 * 
 * DRY RUN POWER
 * 
 * Power(2, 4) = 16
 * Power(2, -4) = 1/16
 * 
 * 2^0 = 1
 * 
 * 2 * Power(2,3) = 2
 * 2*(2*Power(2,2)) = 2*2
 * 2*(2*2*Power(2,1)) = 2*2*2
 * 2*(2*2*2*Power(2,0)) = 2*2*2*2*1
 * 
 * 
 * DRY RUN Friend Pair
 * n = 4
 * fn(n-1) +(n-1)*fn(n-2);
 * fn(3) + 3 * fn(2) = f(4)
 * f(3) = fn(2) + 2 * fn(1) = 2 + 2 * 1 = 4
 * substitue the value
 * fn(3) + 3 * fn(2)
 * 4 + 3 * 2 = 10
 */


/*                Profciency on Recursion Archived            */