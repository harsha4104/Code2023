package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

    Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {

        StackUsingSingleQueue stack = new StackUsingSingleQueue();
        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public void push(int item){
        queue.add(item);
        int size = queue.size();

        for(int i=1;i<size;i++){
            int temp = queue.poll();
            queue.add(temp);
        }
    }

    public int pop() throws Exception {
        if(queue.isEmpty()){
            throw new Exception("Queue is Empty.");
        }
        return queue.poll();
    }


}
