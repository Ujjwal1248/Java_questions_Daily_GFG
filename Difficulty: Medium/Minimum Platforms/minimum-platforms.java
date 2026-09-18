class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j= 0;
        int count = 1, maxCount = 1;
        int n = arr.length;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                count++;
                i++;
            }
            else{
                count --;
                j++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
