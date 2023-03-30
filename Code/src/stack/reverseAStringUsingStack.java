package stack;

import java.util.Stack;

public class reverseAStringUsingStack {

    public static void main(String[] args){

        String input = "GeeksQuiz";
        System.out.println(input);
        System.out.println(reverseString(input));
    }

    public static String reverseString(String input){
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }

        while(!stack.isEmpty()){
            result = result+stack.pop();
        }

        return result;
    }
}
