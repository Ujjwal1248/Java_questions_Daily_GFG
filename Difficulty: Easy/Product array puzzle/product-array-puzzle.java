class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int ans = 1;
        for(int a : arr) ans *= a;
        int[] an = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int curr = 1;
            if(arr[i] == 0){
                for(int j = 0; j < arr.length; j++){
                    if(j == i) continue;
                    curr *= arr[j];
                }
            }
            else curr = ans/arr[i];
            an[i] = curr;
        }
        return an;
    }
}
