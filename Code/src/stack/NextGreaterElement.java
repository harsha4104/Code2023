package stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args){

        int[] arr = new int[]{4,5,2,25};
        int[] arr2 = new int[]{13,7,6,12};
        int[] result = nextGreaterElement(arr);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }
    }

    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
                while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                    int item = stack.pop();
                    arr2[item] = arr[i];
                }
                stack.push(i);
            }


        while(!stack.isEmpty()){
            int item = stack.pop();
            arr2[item] = -1;
        }

        return arr2;
    }
}
