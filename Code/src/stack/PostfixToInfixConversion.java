package stack;

import java.util.Stack;

public class PostfixToInfixConversion {

    public static void main(String[] args){

        String input = "ABC*+D+";

        System.out.println(postFixToInfixConversion(input));
    }

    public static String postFixToInfixConversion(String postfix){
        Stack<String> stack = new Stack<>();

        for(int i=0;i<postfix.length();i++){
            if(isOperator(postfix.charAt(i))){
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = operand1+String.valueOf(postfix.charAt(i))+operand2;
                stack.push(result);
            }
            else{
                stack.push(String.valueOf(postfix.charAt(i)));
            }
        }

        return stack.pop();
    }

    public static boolean isOperator(Character c){
        if(c == '+' || c =='-' || c == '*' || c == '/' || c =='^'){
            return true;
        }
        return false;
    }
}
