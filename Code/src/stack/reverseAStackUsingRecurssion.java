package stack;

import java.util.Stack;

public class reverseAStackUsingRecurssion {

    public static void main(String[] args){

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }

    public static void insertAtBottom(Stack<Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int ele = stack.pop();
        insertAtBottom(stack, element);
        stack.push(ele);
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int element = stack.pop();
        reverse(stack);
        insertAtBottom(stack, element);
    }
}
