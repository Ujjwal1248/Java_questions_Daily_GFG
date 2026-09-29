class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int low = 1;
        int high = arr[n-1] - arr[0];
        int ans = 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            boolean place = canWe(arr, k, mid);
            if(place){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
    public boolean canWe(int[] arr, int k, int gap){
        int count = 1;
        int last = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[last] >= gap){
                last = i;
                count++;
            }
            if(count == k) return true;
        }
        return false;
    }
}