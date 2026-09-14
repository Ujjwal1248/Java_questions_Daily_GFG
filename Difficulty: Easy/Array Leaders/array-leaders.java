class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int last = arr[arr.length-1];
        ans.add(last);
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] >= last){
                ans.add(arr[i]);
                last = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
