class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        return fact(n);
    }
    public int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
