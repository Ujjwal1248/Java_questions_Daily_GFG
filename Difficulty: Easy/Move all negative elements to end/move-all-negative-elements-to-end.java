// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int index = 0;
        int[] na = new int[n];
        for(int i =0;i<n;i++){
            if(arr[i] < 0) continue;
            na[index] = arr[i];
            index++;
        }
        for(int i =0;i<n;i++){
            if(arr[i] < 0){
                na[index] = arr[i];
                index++;
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = na[i];
        }
    }
}