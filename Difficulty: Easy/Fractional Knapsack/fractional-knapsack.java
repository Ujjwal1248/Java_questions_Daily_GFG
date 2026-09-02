class Solution {
    class Item{
        int val, wt;
        double ratio;
        Item(int val, int wt){
            this.val = val;
            this.wt = wt;
            this.ratio = (double) val/wt;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        Item[] item = new Item[val.length];
        for(int i = 0; i < val.length; i++){
            item[i] = new Item(val[i], wt[i]);
        }
        Arrays.sort(item, (a, b) -> Double.compare(b.ratio, a.ratio));
        
        double total = 0.0;
        for(int i = 0;i < val.length; i++){
            if(capacity >= item[i].wt){
                total += item[i].val;
                capacity -= item[i].wt;
            }
            else{
                total += capacity * item[i].ratio;
                break;
            }
        }
        return total;
    }
}