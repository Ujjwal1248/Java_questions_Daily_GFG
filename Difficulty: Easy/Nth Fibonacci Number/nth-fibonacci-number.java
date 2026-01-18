class Solution {
    public int nthFibonacci(int n) {
        // code here
        return f(n);
    }
    public int f(int n){
        if(n == 1 || n== 0) return n;
        return f(n-1) + f(n-2);
    }
}