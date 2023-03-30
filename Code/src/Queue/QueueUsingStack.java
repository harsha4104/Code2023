package Queue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.size());
    }

    public void add(int item){
        stack.push(item);
    }

    public int pop() throws Exception {
        if(stack.isEmpty()){
            throw new Exception("Stack is Empty.");
        }
        return getLowestItemFromStack(stack);
    }

    public int getLowestItemFromStack(Stack<Integer> stack){
        if(stack.size() ==1){
            return stack.pop();
        }
        int item = stack.pop();
        int result = getLowestItemFromStack(stack);
        stack.push(item);
        return result;
    }

    public int size(){
        return stack.size();
    }

}
