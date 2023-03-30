package stack;

import java.util.Stack;

public class StockSpanProblem {

    public static void main(String[] args){

        int[] input = new int[]{100,80,60,70,60,75,85};

        int[] input2 = new int[]{10,4,5,90,120,80};

        int[] result = stockSpanProblem(input);

        for(int i=0;i<input.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] stockSpanProblem(int[] price){
        Stack<Integer> stack = new Stack<>();

        int[] s = new int[price.length];
        for(int i=0;i<price.length;i++){
            s[i] = 1;
        }
        stack.push(0);
        for(int i=1;i<price.length;i++){
            while(!stack.isEmpty() && price[stack.peek()] <= price[i]){
                int index = stack.pop();
                if(!stack.isEmpty()) {
                    s[index] = index -stack.peek();
                }
                else{
                    s[index] = index+1;
                }
            }
            if(!stack.isEmpty() && price[stack.peek()] > price[i]) {
                s[i] = i - stack.peek();
                stack.push(i);
            }
            else{
                stack.push(i);
            }
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            if(stack.isEmpty()){
                s[index] = index+1;
            }
            else{
                s[index] = index-stack.peek();
            }
        }
        return s;
    }
}
