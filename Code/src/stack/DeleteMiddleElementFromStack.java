package stack;

import java.util.Stack;

public class DeleteMiddleElementFromStack {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        deleteMiddle(stack, stack.size(), 0);

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void deleteMiddle(Stack<Integer> stack, int size, int current){
        if(current == size/2){
            stack.pop();
            return;
        }
        int element = stack.pop();
        deleteMiddle(stack, size, current+1);
        stack.push(element);
    }
}
