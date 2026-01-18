class Solution {

    void printNos(int N) {
        // code here
        helper(N);
    }
    public static void helper(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        helper(n-1);
    }
}