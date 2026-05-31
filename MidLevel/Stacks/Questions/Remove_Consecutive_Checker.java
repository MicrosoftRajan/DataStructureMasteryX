package MidLevel.Stacks.Questions;

import java.util.Stack;

public class Remove_Consecutive_Checker { 

    public static void Romove_Consicutive_Character(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            

            if(st.isEmpty() || st.peek()!= ch){
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        System.out.print(sb.toString() + " ");

    }

    public static void Remove_Consicutive_char(String s){
        Stack<Character> st  = new Stack<>();
        

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            } else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : st){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        String s = "aabbccddeeaaf";
        Romove_Consicutive_Character(s);
        System.out.println();
        System.out.println("----------- Remove Consicutive Character ----------------");
        Remove_Consicutive_char(s);

        
        
    }
}


/*
 !STRING S = ABBCCCDDDDEEEE
 *for loop - iterate over the String
 *if agar stack empty toh push karo ch nahi toh st.peek()!= ch push karo mtlb same char nahi hai
 *aur uske baad string mai COnvert karo do

*/

