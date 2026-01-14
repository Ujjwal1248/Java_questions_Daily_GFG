class Solution {
    public int counter = 0;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        helper(n, from, to, aux);
        return counter;
    }
    public void helper(int n, int src, int dest, int helper) {
        
        if(n==1){
            counter++;
            
            return;
        }
        
        helper(n-1, src, helper, dest);
        counter++;
        
        helper(n-1, helper, dest, src);
    }
    
}
