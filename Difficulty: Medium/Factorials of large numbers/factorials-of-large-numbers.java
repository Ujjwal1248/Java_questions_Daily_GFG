class Solution {
    public ArrayList<Integer> factorial(int n) {
        // code here
        int[] arr = new int[5000];
        arr[0] = 1;
        int resSize = 1;
        for(int i = 2; i <= n; i++){
            resSize = multiply(arr, i, resSize);
        }
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = resSize - 1; i >= 0; i--){
           ll.add(arr[i]); 
        }
        return ll;
    }
    public int multiply(int[] arr, int x, int resSize){
        int carry = 0;
        for(int i = 0; i < resSize; i++){
            int curr = arr[i] * x + carry;
            arr[i] = curr% 10;
            carry = curr / 10;
        }
        while(carry != 0){
            arr[resSize] = carry % 10;
            carry /= 10;
            resSize++;
        }
        return resSize;
    }
}