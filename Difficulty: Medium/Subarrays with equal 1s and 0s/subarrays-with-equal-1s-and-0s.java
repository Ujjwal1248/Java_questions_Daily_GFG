class Solution {
    public int countSubarray(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int c = 0;
        map.put(0, 1);
        for(int num : arr){
            if(num == 0) sum += -1;
            else sum += 1;
            if(map.containsKey(sum)){
                c += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return c;
    }
}