package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetSumEducative {

    public static void main(String[] args){

        int[] arr = {1,2,7,1,5};

//        System.out.println(isSubsetSum(arr, 0, 0, 10));
//
//        System.out.println(totalSubsetSum(arr, 0, 0, 10));
//
//        List<List<Integer>> answer = new ArrayList<>();
//
//        isSubsetSum(arr, 0, 0, 10, new ArrayList<>(), answer);
//
//        for(List<Integer> list : answer){
//            for(Integer item: list){
//                System.out.print(item+" ");
//            }
//
//            System.out.println();
//        }

        System.out.println(subsetSum(arr, 10));
    }

    public static boolean isSubsetSum(int[] arr, int index, int sum, int target){

        if(sum == target){
            return true;
        }

        if(sum > target){
            return false;
        }

        if(index >= arr.length){
            return false;
        }

        return isSubsetSum(arr, index+1, sum+arr[index], target) || isSubsetSum(arr, index+1, sum, target);
    }

    public static int totalSubsetSum(int[] arr, int index, int sum, int target){

        if(sum == target){

            return 1;
        }

        if(sum > target){
            return 0;
        }

        if(index >= arr.length){
            return 0;
        }

        return totalSubsetSum(arr, index+1, sum+arr[index], target) + totalSubsetSum(arr, index+1, sum, target);
    }

    public static void isSubsetSum(int[] arr, int index, int sum, int target, List<Integer> list, List<List<Integer>> answer){

        if(sum == target){

            List<Integer> result = new ArrayList<>(list);
            answer.add(result);
            return;
        }

        if(sum > target){
            return;
        }

        if(index >= arr.length){
            return;
        }

        list.add(arr[index]);

        isSubsetSum(arr, index+1, sum+arr[index], target, list, answer);

        list.remove(list.size()-1);
        isSubsetSum(arr, index+1, sum, target,list, answer);
    }

    public static boolean subsetSum(int[] arr, int targetSum){

        boolean[][] dp = new boolean[arr.length][targetSum+1];

        for(int i=0;i<arr.length;i++){
            dp[i][0] = true;
        }

        for(int s=0;s<=targetSum;s++){
            dp[0][s] = s == arr[0] ? true:false;
        }

        for(int i=1;i<arr.length;i++){
            for(int s=1;s<=targetSum;s++){

                if(dp[i-1][s]){
                    dp[i][s] = dp[i-1][s];
                }
                else if(s-arr[i] >= 0){
                    dp[i][s] = dp[i-1][s-arr[i]];
                }
            }
        }

        return dp[arr.length-1][targetSum];
    }
}
