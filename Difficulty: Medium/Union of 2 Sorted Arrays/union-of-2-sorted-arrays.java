class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            int val;
            if(a[i] < b[j]){
                val = a[i++];
            }
            else if(a[i] > b[j]){
                val = b[j++];
            }
            else{
                val = a[i++];
                j++;
            }
            if(ans.isEmpty() || ans.get(ans.size() - 1) != val){
                ans.add(val);
            }
        }
        while(i < a.length){
            if(ans.isEmpty() || ans.get(ans.size() - 1) != a[i]){
                ans.add(a[i]);
            }
            i++;
        }
        while(j < b.length){
            if(ans.isEmpty() || ans.get(ans.size() - 1) != b[j]){
                ans.add(b[j]);
            }
            j++;
        }
        return ans;
    }
}
