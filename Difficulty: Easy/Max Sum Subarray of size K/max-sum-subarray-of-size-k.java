class Solution {
    public int maxSubarraySum(int[] nums, int k) {
        // Code here
        int sum = 0;
        int n = nums.length;
        int left = 0 ;
        int right = k;
        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }
        int ans = sum;
        while(right < n){
            sum = sum - nums[left] + nums[right];
            left++;
            right++;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}