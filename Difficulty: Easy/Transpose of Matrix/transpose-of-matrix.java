class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i < mat.length; i++){
            ArrayList<Integer> curr = new ArrayList<>();
            for(int j = 0; j < mat[0].length; j++){
                curr.add(mat[j][i]);
            }
            res.add(curr);
        }
        return res;
    }
}