package stack;

import java.util.Stack;

public class FindTheIndexOfClosingBracketOfGivenOpeningBracket {

    public static void main(String[] args){

        String expression = "[ABE[CD]][PF]";
        System.out.println(index(expression, 4));
    }

    public static int index(String expression, int bracketIndex){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i) ==']'){
                int item = stack.pop();
                if(item == bracketIndex){
                    return i;
                }
            }
            else if(expression.charAt(i) == '['){
                stack.push(i);
            }
        }

        return -1;
    }
}
