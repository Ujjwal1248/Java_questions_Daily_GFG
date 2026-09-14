class Solution {
    public int longestSubarray(int[] nums, int k) {
        // code here
        int sum = 0;
        int maxL = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k) maxL = i + 1;
            if(map.containsKey(sum - k)){
                maxL = Math.max(maxL, i - map.get(sum - k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxL;
    }
}
