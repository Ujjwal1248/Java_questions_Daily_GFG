class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int left = target - arr[i];
            if(map.containsKey(left)) return true;
            map.put(arr[i], left);
        }
        return false;
    }
}