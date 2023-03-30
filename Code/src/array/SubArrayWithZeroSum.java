package array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithZeroSum {

    public static void main(String[] args){

        int[] input = new int[]{3,4,-7,3,1,3,1,-4,-2,-2};

        System.out.println(checkForSubArrayWithZeroSum(input,0));
    }

    public static boolean checkForSubArrayWithZeroSum(int[] input, int k){

        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int result = 0;

        for(int i=0;i<input.length;i++){
            currSum += input[i];

            if(currSum == k){
                result = result+1;
            }
            int preSum = currSum-k;

            if(map.containsKey(preSum)){
                result+= map.get(preSum);
                map.put(preSum,map.get(preSum)+1);
            }
            else{
                map.put(preSum, 1);
            }
        }

        if(result >0){
            return true;
        }
        return false;
    }
}
