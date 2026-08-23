class Solution {
    static int perfectSum(int[] nums, int sum) {
        // code here
        Integer[][] dp = new Integer[nums.length][sum+1];
        // for(int i = 0; i < nums.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        return helper(nums, sum, 0, dp);
     }
     static int helper(int arr[], int sum, int idx, Integer[][] dp) {
         if(idx >= arr.length){
            if(sum == 0) return 1;
            return 0;
         }
         if(dp[idx][sum] != null) return dp[idx][sum];

         int notTake = helper(arr, sum, idx + 1, dp);
         int take = 0;
         if(sum >= arr[idx]){
             take = helper(arr, sum - arr[idx], idx + 1, dp);
         }
         return dp[idx][sum] = notTake + take;
     }
}