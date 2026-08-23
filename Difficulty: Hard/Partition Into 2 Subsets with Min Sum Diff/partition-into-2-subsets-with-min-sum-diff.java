class Solution {
    public int minDifference(int nums[]) {
        // code here
        int total = 0;
        for(int num : nums){
            total += num;
        }
        Boolean[][] dp = new Boolean[nums.length][total+1];
        int mDiff = Integer.MAX_VALUE;
        for(int i = 0; i <= total/2; i++){
            if(helper(nums,i, 0, dp)){
                int sum2 = total - i;
                mDiff = Math.min(mDiff, Math.abs(sum2 - i));
            }
        }
         return mDiff;
     }
     static boolean helper(int arr[], int sum, int idx, Boolean[][] dp) {
         if(sum == 0) return true;
         if(idx >= arr.length) return false;
         if(dp[idx][sum] != null) return dp[idx][sum];

         boolean notTake = helper(arr, sum, idx + 1, dp);
         boolean take = false;
         if(sum >= arr[idx]){
             take = helper(arr, sum - arr[idx], idx + 1, dp);
         }
         return dp[idx][sum] = notTake || take;
     }
}
