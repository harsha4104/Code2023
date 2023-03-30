package dynamicProgramming;

public class NumberOfWaysToPut1By4TilesInNBy4matrix {

    public static void main(String[] args){

        int n=16;

        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;

        for(int i=5;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-4];
        }

        System.out.println(dp[n]);
        System.out.println(findTotalWays(n));
    }

    public static int findTotalWays(int n){
        if (n < 1) {
            return 0;
        }

        if (n < 4) {
            return 1;
        }

        if (n == 4) {
            return 2;
        }

        return findTotalWays(n - 1) + findTotalWays(n - 4);
    }
}
