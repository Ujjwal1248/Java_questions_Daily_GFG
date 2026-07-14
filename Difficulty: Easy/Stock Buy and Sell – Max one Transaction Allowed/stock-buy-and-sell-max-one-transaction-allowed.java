class Solution {
    public int maxProfit(int[] nums) {
        // Code here
        int minPrice = nums[0];
        int maxProfit = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < minPrice) minPrice = nums[i];
            maxProfit = Math.max(maxProfit, nums[i] - minPrice);
        }
        return maxProfit;
    }
}