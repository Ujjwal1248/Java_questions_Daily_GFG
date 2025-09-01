class Solution {
    public int findMin(int n) {
        // code here
        int[] note = { 1, 2, 5, 10 };
        int count = 0;
        for(int i = 3; i >= 0; i--){
            while(n >= note[i]){
                n -= note[i];
                count ++;
            }
        }
        return count;
    }
}
