class Solution {
    public void sort012(int[] arr) {
        // code here
        int z = 0, o=0, t=0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) z++;
            else if(arr[i] == 1) o++;
            else t++;
        }
        for(int i = 0; i < z; i++){
            arr[i] = 0;
        }
        for(int i = 0; i < o; i++){
            arr[i+z] = 1;
        }
        for(int i = 0; i < t; i++){
            arr[z+o+i] = 2;
        }
    }
}