package backtracking;

import java.util.HashMap;
import java.util.Map;

public class KnapSack01 {

    public static void main(String[] args){

        int[] weight = new int[]{1,2,3,5};
        int[] profit = new int[]{1,6,10,16};

        System.out.println(maximizeProfit(weight, profit, 6, 0, 0));

        System.out.println(maximizeProfitTopDown(weight, profit, 6,0,0, new HashMap<>()));

        System.out.println(maximumProfitBottomUp(weight, profit, 6));

    }

    public static int  maximizeProfit(int[] weight, int[] profit, int totalWeightWeCanTake, int index, int maxProfit){

        if(index >= weight.length){
            return maxProfit;
        }

        if(totalWeightWeCanTake- weight[index] < 0){
            return maximizeProfit(weight, profit, totalWeightWeCanTake, index+1, maxProfit);
        }


        return Math.max(maximizeProfit(weight, profit, totalWeightWeCanTake-weight[index], index+1, maxProfit+profit[index]),
                maximizeProfit(weight, profit, totalWeightWeCanTake, index+1, maxProfit));
    }

    public static int maximizeProfitTopDown(int[] weight, int[] profit, int totalWeightWeCanTake, int index,int maxProfit, Map<String,Integer> map){

        if(index >= weight.length){
            return maxProfit;
        }

        String key = String.valueOf(index)+"|"+String.valueOf(weight[index]);

        if(totalWeightWeCanTake-weight[index] < 0){
            if(map.containsKey(key)){
                return map.get(key);
            }

            int item = maximizeProfitTopDown(weight, profit, totalWeightWeCanTake, index+1, maxProfit, map);
            map.put(key, item);
            return item;

        }

        if(map.containsKey(key)){
            return map.get(key);
        }

        int item = Math.max(maximizeProfitTopDown(weight, profit, totalWeightWeCanTake-weight[index], index+1, maxProfit+profit[index], map),
                maximizeProfitTopDown(weight, profit, totalWeightWeCanTake, index+1, maxProfit, map));

        map.put(key, item);
        return item;
   }

   public static int maximumProfitBottomUp(int[] weight, int[] profit, int capacity){

        int[][] dp = new int[weight.length][capacity+1];

        for(int i=0;i<weight.length-1;i++){
            dp[i][0] = 0;
        }

        for(int c=1;c<=capacity;c++){
            if(weight[0] <= c){
                dp[0][c] = profit[0];
            }
        }

        for(int i=1;i<weight.length;i++){
            for(int c=1; c<=capacity;c++){
                dp[i][c] = Math.max(dp[i-1][c], weight[i] <=c ? profit[i]+dp[i-1][c-weight[i]]:0);
            }
        }

        return dp[weight.length-1][capacity];
   }
}
