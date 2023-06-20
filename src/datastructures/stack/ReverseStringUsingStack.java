package datastructures.stack;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>();
        String rev = "";

        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()) {
            rev += stack.pop();
        }

        return rev;
    }
}
