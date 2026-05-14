package ProblemsSet;
import java.io.*;

public class Reverse_String {

    public static void Reverse(StringBuilder str){
        int lo = 0, hi = str.length() - 1;

        while(lo < hi){

            char temp = str.charAt(lo);

            str.setCharAt(lo, str.charAt(hi));
            str.setCharAt(hi, temp);
            lo++;
            hi--;
        }
        System.out.println(str.toString().toLowerCase());

    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rajan");
        Reverse(sb);
        
    }
    
}
