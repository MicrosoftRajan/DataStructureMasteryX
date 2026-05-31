package MidLevel.Stacks.Questions;

import java.util.Stack;

public class Parenthesis_Checker {

    public static boolean Valid_Parenthesis(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;
                if (ch == ')' && st.peek() != '(') {
                    return false;
                }
                if (ch == '}' && st.peek() != '{') {
                    return false;
                }
                if (ch == ']' && st.peek() != '[') {
                    return false;
                }
                st.pop();
            }

        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{}()[]}";
        System.out.println(Valid_Parenthesis(s));

    }

}