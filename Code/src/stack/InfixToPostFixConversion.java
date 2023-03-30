package stack;

import java.util.*;
import java.util.Stack;

public class InfixToPostFixConversion {

    public static void main(String[] args){

        String input = "A+B*C+D";
        String input2 = "((A+B)-C*(D/E))+F";
        System.out.println(infixtoPostfix(input));

    }

    public static String infixtoPostfix(String infix){

        java.util.Stack<Character> stack = new Stack<>();
        String result = "";

        for(int i=0;i<infix.length();i++){

            if(infix.charAt(i) == '('){
                stack.push(infix.charAt(i));
            }
            else if(infix.charAt(i) == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result = result+stack.pop().toString();
                }
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            }
            else if(isOperator(infix.charAt(i))){
                while(!stack.isEmpty() && priority(infix.charAt(i)) >= priority(stack.peek())){
                    result = result+stack.pop().toString();
                }
                stack.push(infix.charAt(i));
            }
            else{
               result = result+ String.valueOf(infix.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            result = result+stack.pop().toString();
        }

            return result;
    }

    public static boolean isOperator(Character c){
        if(c == '+' || c == '-' || c == '/' || c == '*' || c == '^'){
            return true;
        }
        return false;
    }

    public static int priority(Character c){
        if(c == '('){
            return 4;
        }
        else if(c == '+'|| c == '-'){
            return 3;
        }
        else if(c == '/' || c == '*'){
            return 2;
        }
        else {
            return 1;
        }
    }
}
