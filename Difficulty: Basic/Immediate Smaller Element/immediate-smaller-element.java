class Solution {
    public void immediateSmaller(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                nums[i] = nums[i + 1];
            } else {
                nums[i] = -1;
            }
        }
        nums[n - 1] = -1; // Last element always -1
    }
}
