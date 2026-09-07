class Solution {
    public int maximumPath(int[][] nums) {
        // code here
        int m = nums.length, n = nums[0].length;
        Integer[][] dp = new Integer[m][n];
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, helper(nums, m, n, 0, i, dp));
        }
        return ans;
    }
    public int helper(int[][] nums, int m, int n, int i, int j, Integer[][] dp) {
        if(j < 0 || j >=n) return Integer.MIN_VALUE;
        if(i == m) return 0;
        if(dp[i][j] != null) return dp[i][j];
        
        int downLeft = nums[i][j] + helper(nums, m, n, i+1, j-1, dp);
        int down = nums[i][j] + helper(nums, m, n, i+1, j, dp);
        int downRight = nums[i][j] + helper(nums, m, n, i+1, j+1, dp);
        
        return dp[i][j] = Math.max(downLeft, Math.max(down, downRight));
    }
}