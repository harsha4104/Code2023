package stack;

import java.util.Stack;

public class DesignStackWithGetMIddleElementInConstantTime {

    Stack<Integer> stack = new Stack<>();
    int min = 0;

    public static void main(String[] args){

        DesignStackWithGetMIddleElementInConstantTime stack = new DesignStackWithGetMIddleElementInConstantTime();
        stack.push(3);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.push(2);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public void push(int item){
        if(stack.isEmpty()){
            min = item;
            stack.push(item);
            return;
        }

        if(min > item){
            int x = 2*item - min;
            stack.push(x);
            min = item;
            return;
        }

        stack.push(item);
    }

    public int pop(){
        if(stack.isEmpty()){
            return -1;
        }

        int item = stack.pop();
        if(item < min){
            int temp = min;
            min = 2*min-item;
            return temp;
        }

        return item;
    }

    public int getMin(){
        return min;
    }

}
