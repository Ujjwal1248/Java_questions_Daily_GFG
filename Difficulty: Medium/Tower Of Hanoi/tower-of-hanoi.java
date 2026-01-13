class Solution {
    public int count = 0;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        number(n,from, aux, to);
        return count;
    }
    public void number(int n, int src, int helper, int dest){
        if(n == 1){
            count++;
            return;
        }
        number(n-1, src, dest, helper);
        count++;
        number(n-1, helper, src, dest);
    }
}
