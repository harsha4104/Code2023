package stack;

import java.util.Stack;

public class LargestAreaOfRectangleInHistogram {

    public static void main(String[] args){

        int[] arr = new int[]{6,2,5,4,5,3,6};
        System.out.println(histogramArea(arr));
    }

    public static int histogramArea(int[] arr){
        int i = 0;
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        while(i<arr.length){
            if(stack.isEmpty() || arr[stack.peek()] <= arr[i]){
                stack.push(i++);
            }
            else{
                int top = stack.pop();
                int area = arr[top]*(stack.isEmpty()? i: i-stack.peek()-1);
                maxArea = maxArea > area ? maxArea : area;
            }
        }

        while(!stack.isEmpty()){
            int top = stack.pop();
            int area = arr[top]*(stack.isEmpty()? i: i-stack.peek()-1);
            maxArea = maxArea > area ? maxArea : area;
        }

        return maxArea;
    }
}
