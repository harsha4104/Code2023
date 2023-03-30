package stack;

import java.util.Stack;

public class InfixToPerfixConversion {

    public static void main(String[] args){

        String input = "A*B+C/D";
        String input2 = "(A-B/C)*(A/K-L)";
        System.out.println(infixToPrefix(input2));

    }

    public static String infixToPrefix(String infix){

        Stack<Character> stack = new Stack<>();
        String reversInfix = reverseString(infix);
        String result = "";

        for(int i=0;i<reversInfix.length();i++){
            if(reversInfix.charAt(i) == ')'){
                stack.push(reversInfix.charAt(i));
            }
            else if(reversInfix.charAt(i) == '('){
                while(!stack.isEmpty() && stack.peek() != ')'){
                    result = result+stack.pop().toString();
                }
                if(!stack.isEmpty() && stack.peek() ==')') {
                    stack.pop();
                }
            }
            else if(isOperator(reversInfix.charAt(i))){
                while(!stack.isEmpty() && priority(reversInfix.charAt(i)) >= priority(stack.peek())){
                    result = result+stack.pop().toString();
                }
                stack.push(reversInfix.charAt(i));
            }
            else{
                result = result+String.valueOf(reversInfix.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            result = result + stack.pop().toString();
        }

        String prefix = reverseString(result);
        return prefix;
    }

    public static int priority(Character c){
        if(c == ')'){
            return 4;
        }
        if(c == '+' || c =='-'){
            return 3;
        }
        else if(c == '*' || c == '/'){
            return 2;
        }
        else if (c == '^'){
            return 1;
        }
        else{
            return 1000;
        }
    }

    public static boolean isOperator(Character c){
        if(c =='+' || c == '-' || c == '*' || c == '/' || c == '^'){
            return true;
        }
        return false;
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
