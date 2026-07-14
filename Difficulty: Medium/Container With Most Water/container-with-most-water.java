class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int maxA = 0;
        while(left < right){
            int currA = Math.min(arr[left], arr[right]) * (right - left);
            maxA = Math.max(maxA, currA);
            if(arr[left] < arr[right]) left++;
            else right--;
        }
        return maxA;
    }
}