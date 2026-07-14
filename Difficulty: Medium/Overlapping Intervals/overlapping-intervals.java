class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(arr[0][0]);
        first.add(arr[0][1]);
        ans.add(first);
        
        for(int i = 1; i < arr.length; i++){
            ArrayList<Integer> last = ans.get(ans.size() - 1);
            if(arr[i][0] <= last.get(1)){
                last.set(1, Math.max(last.get(1), arr[i][1]));
            }
            else{
                ArrayList<Integer> curr = new ArrayList<>();
                curr.add(arr[i][0]);
                curr.add(arr[i][1]);
                ans.add(curr);
            }
        }
        return ans;
    }
}