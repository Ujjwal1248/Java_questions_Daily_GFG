class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0;
        int c = 1, mC = 1;
        int n = arr.length;
        while(i < n && j < n){
            if(arr[i] > dep[j]){
                c--;
                j++;
            }
            else{
                c++;
                i++;
            }
            mC = Math.max(mC, c);
        }
        return mC;
    }
}
