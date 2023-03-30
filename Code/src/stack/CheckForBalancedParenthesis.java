package stack;

import java.util.Stack;

public class CheckForBalancedParenthesis {

    public static void main(String[] args){

        String input = "[(])";
        System.out.println(isParenthesisBalanced(input));

    }

    public static boolean isParenthesisBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '['){
                stack.push(input.charAt(i));
            }
            else if(input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']'){
                if(input.charAt(i) == ')' && stack.peek() != '('){
                    return false;
                }
                if(input.charAt(i) == '}' && stack.peek() != '{'){
                    return false;
                }
                if(input.charAt(i) ==']' && stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
