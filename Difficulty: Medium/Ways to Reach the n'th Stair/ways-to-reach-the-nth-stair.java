class Solution {
    public int countWays(int n) {
        // code here
        Integer[] dp = new Integer[n+1];
        return helper(n, dp);
    }
    public int helper(int n, Integer[] dp){
        if(n==0) return 1;
        else if(n < 0) return 0;
        if(dp[n] != null) return dp[n];
        int one = helper(n-1, dp);
        int two = 0;
        if(n-2 >= 0) two = helper(n-2, dp);
        return dp[n] = one + two;
    }
}