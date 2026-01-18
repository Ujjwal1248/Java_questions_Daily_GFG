class Solution {
    public int reverseExponentiation(int n) {
        // code here
        String numberStr = String.valueOf(n);
        
        // Create a StringBuilder and use its reverse() method
        StringBuilder sb = new StringBuilder(numberStr);
        sb.reverse();
        
        // Convert the reversed string back to an integer
        int t = Integer.parseInt(sb.toString());
        return powerr(n, t);
    }
    public int powerr(int n, int t){
        if(t == 1){
            return n;
        }
        return n * powerr(n, t-1);
    }
}
