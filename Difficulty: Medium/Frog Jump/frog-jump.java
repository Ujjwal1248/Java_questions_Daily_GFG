class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp = new int[height.length + 1];
        Arrays.fill(dp, -1);
        return helper(0, height, dp);
    }
    public static int helper(int curr, int[] height, int[] dp){
        // if(curr >= height.length) return Integer.MAX_VALUE;
        if(curr == height.length-1) return 0;
        if(dp[curr] != -1) return dp[curr];
        int left = helper(curr + 1, height, dp) + Math.abs(height[curr] - height[curr+1]);
        int right = Integer.MAX_VALUE;
        if(curr + 2 < height.length){
            right = helper(curr + 2, height, dp) + Math.abs(height[curr] - height[curr+2]);
        }
        dp[curr] = Math.min(left, right);
        return dp[curr];
    }
}

























