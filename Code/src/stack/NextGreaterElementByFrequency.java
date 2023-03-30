package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementByFrequency {

    public static void main(String[] args){

        int[] arr = new int[]{1,1,2,3,4,2,1};
        int[] arr2 = new int[]{1,1,1,2,2,2,2,11,3,3};
        int[] result = nextGreaterElementByFrequency(arr2);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] nextGreaterElementByFrequency(int[] arr){
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        int[] arr2 = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(frequency.containsKey(arr[i])){
                frequency.put(arr[i], frequency.get(arr[i])+1);
            }
            else{
                frequency.put(arr[i], 1);
            }
        }

        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && frequency.get(arr[stack.peek()]) < frequency.get(arr[i])){
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
