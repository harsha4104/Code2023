package backtracking;

public class EqualSubsetPartition {

    public static void main(String[] args){

        int[] arr = new int[]{1,1,3,4,7};

        System.out.println(isPartitionPossible(arr));
    }

    public static boolean isPartitionPossible(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }

        if(sum%2 != 0){
            return false;
        }

//        return canPartitionInEqualSubset(arr, 0, 0, sum/2);

        return  canPartitionInEqualSubset(arr,sum/2);
    }

    public static boolean canPartitionInEqualSubset(int[] arr, int currentIndex, int currentSum, int targetSum){

        if(currentIndex >= arr.length){
            return false;
        }

        if(currentSum == targetSum){
            return true;
        }

        if(currentSum > targetSum){
            return false;
        }

        return canPartitionInEqualSubset(arr, currentIndex+1, currentSum+arr[currentIndex], targetSum) ||
                canPartitionInEqualSubset(arr, currentIndex+1, currentSum, targetSum);
    }

    public static boolean canPartitionInEqualSubset(int[] arr, int targetSum){

        boolean[][] dp = new boolean[arr.length][targetSum+1];

        for(int i=0;i<arr.length;i++){
            dp[i][0] = true;
        }

        for(int s= 1; s<=targetSum;s++){
            if(arr[0]==s){
                dp[0][s] = true;
            }
        }

        for(int i=1;i<arr.length;i++){
            for(int s=1; s<=targetSum;s++){
                dp[i][s] = dp[i-1][s];

                if(s>= arr[i]){
                 dp[i][s] = dp[i-1][s] || dp[i-1][s-arr[i]];
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int s = 0; s<=targetSum;s++){
                System.out.print(dp[i][s]+" ");
            }

            System.out.println();
        }

//        for(int i= arr.length-1;i>=0;){
//            for(int s = targetSum ; s>=0;){
//                if(dp[i][s] == true){
//                    System.out.println(arr[i]+" ");
//
//                    i= i-1;
//                    s = dp[i][s] ? s : s-arr[i+1];
//                }
//            }
//        }

        return dp[arr.length-1][targetSum];
    }
}
