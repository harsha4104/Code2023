package stack;

import java.util.Stack;

public class ArithmeticExperssionEvaluation {

    public static void main(String[] args){

        String input = "(2+4)*(4+6)";
        String postfix = infixToPostfix(input);
        System.out.println(postfix);
        System.out.println(expressionEvaluation(postfix));

    }

    public static int expressionEvaluation(String postfix){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<postfix.length();i++){
            if(isOperator(postfix.charAt(i))){
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;

                if(postfix.charAt(i) == '+'){
                    result = operand1 + operand2;
                }
                else if(postfix.charAt(i) == '-'){
                    result = operand1 - operand2;
                }
                else if(postfix.charAt(i) == '*'){
                    result = operand1 * operand2;
                }
                else if(postfix.charAt(i) == '/'){
                    result = operand1 / operand2;
                }
                else if(postfix.charAt(i) == '^'){
                    result = operand1 ^ operand2;
                }
                else{
                    result = 0;
                }
                stack.push(result);
            }
            else{
                stack.push(postfix.charAt(i)-'0');
            }
        }

        return stack.pop();
    }

    public static String infixToPostfix(String infix){

        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0;i<infix.length();i++){
            if(infix.charAt(i) == '('){
                stack.push(infix.charAt(i));
            }
            else if(infix.charAt(i) == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result = result+stack.pop().toString();
                }
                if(!stack.isEmpty() && stack.peek() =='('){
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
                result = result+String.valueOf(infix.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            result = result + stack.pop().toString();
        }

        return result;
    }

    public static boolean isOperator(Character c){
        if(c =='+' || c == '-' || c == '*' || c == '/' || c == '^'){
            return true;
        }
        return false;
    }

    public static int priority(Character c){
        if(c == '+' || c == '-'){
            return 3;
        }
        else if(c == '*' || c == '/'){
            return 2;
        }
        else if(c =='^'){
            return 1;
        }
        else{
            return 1000;
        }
    }
}
