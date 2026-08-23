class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        Integer[][] dp = new Integer[val.length][capacity+1];
        return helper(val, wt, capacity, 0, dp);
    }
    public int helper(int val[], int wt[], int capacity, int idx, Integer[][] dp) {
        if(idx == val.length || capacity == 0) return 0;
        if(dp[idx][capacity] != null) return dp[idx][capacity];
        
        int notTake = helper(val, wt, capacity, idx + 1, dp);
        int take = Integer.MIN_VALUE;
        if(capacity >= wt[idx]){
            take = val[idx] + helper(val, wt, capacity - wt[idx], idx, dp);
        }
        return dp[idx][capacity] = Math.max(take, notTake);
    }
}