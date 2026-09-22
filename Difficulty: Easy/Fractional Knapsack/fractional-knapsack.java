class Solution {
    class Item{
        int val;
        int wt;
        double ratio;
        Item(int val, int wt){
            this.val = val;
            this.wt = wt;
            this.ratio = (double)val/wt;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        Item[] items = new Item[n];
        for(int i = 0; i < val.length; i++){
            items[i] = new Item(val[i], wt[i]);
        }
        Arrays.sort(items, (a,b)->Double.compare(b.ratio , a.ratio));
        
        double total = 0;
        
        for(Item item : items){
            if(capacity >= item.wt){
                capacity -= item.wt;
                total+= item.val;
            }
            else{
                total += item.ratio*capacity;
                break;
            }
        }
        return total;
    }
}