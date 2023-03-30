package stack;

import java.util.Stack;

public class ReverseIndividualWords {

    public static void main(String[] args){

        String input = null;
        System.out.println(reverseIndividualWords(input));

    }

    public static String reverseIndividualWords(String input){
        Stack<Character> stack = new Stack<>();
        String result = "";
        if(input == null){
            return result;
        }
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) ==' '){
                while(!stack.isEmpty()){
                    result = result+stack.pop().toString();
                }
                result = result+String.valueOf(input.charAt(i));
            }
            else{
                stack.push(input.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            result = result+stack.pop().toString();
        }

        return result;
    }
}
