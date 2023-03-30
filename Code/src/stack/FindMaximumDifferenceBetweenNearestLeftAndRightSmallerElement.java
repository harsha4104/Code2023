package stack;

import java.util.Stack;

public class FindMaximumDifferenceBetweenNearestLeftAndRightSmallerElement {

    public static void main(String[] arg){

        int[] arr = new int[]{2,4,8,7,7,9,3};
        System.out.println(maximumDifference(arr));
    }

    public static int maximumDifference(int[] arr){
        Stack<Integer> stack = new Stack<>();

        int[] right = new int[arr.length];
        int[] left = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                int item = stack.pop();
                right[item] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int item = stack.pop();
            right[item] = 0;
        }

        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                int item = stack.pop();
                left[item] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int item = stack.pop();
            left[item] = 0;
        }

        int result = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            result = Math.max(result, Math.abs(left[i]-right[i]));
        }

        return result;
    }
}
