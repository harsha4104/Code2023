package stack;

import java.util.Stack;

public class SortStackUsingTemporaryStack {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(10);

        sortStack(stack);
    }

    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            int item = stack.pop();
            while(!temp.isEmpty() && temp.peek() < item){
                stack.push(temp.pop());
            }
            temp.push(item);
        }

        while(!temp.isEmpty()){
            System.out.print(temp.pop()+" ");
        }
    }
}
