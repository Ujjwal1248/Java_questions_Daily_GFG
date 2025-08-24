// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int num = 1;
        for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
                num = Math.max(num, i);
                while(n%i == 0){
                    n /= i;
                }
            }
        }
        if(n > 1) num = n;
        return num;
    }
}