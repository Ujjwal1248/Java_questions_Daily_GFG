class Solution {
    int[] countGreater(int arr[], int indices[]) {
        // code here
        int[] ans = new int[indices.length];
        Arrays.fill(ans, 0);
        for(int i = 0; i < indices.length; i++){
            for(int j = indices[i] + 1; j < arr.length; j++){
                if(arr[j] > arr[indices[i]]) ans[i]++;
            }
        }
        return ans;
    }
}
