class Solution {
    class Item{
        int value, weight;
        double ratio;
        Item(int v, int w){
            value = v;
            weight = w;
            ratio = (double) v/w;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        Item[] items = new Item[n];
        
        for(int i = 0; i < n; i++){
            items[i] = new Item(val[i], wt[i]);
        }
        
        Arrays.sort(items, (a,b)->Double.compare(b.ratio, a.ratio));
        
        double total = 0.0;
        
        for(int i = 0; i < n; i++){
            if(capacity >= items[i].weight){
                total += items[i].value;
                capacity -= items[i].weight;
            }
            else{
                total += items[i].ratio * capacity;
                break;
            }
        }
        
        return total;
    }
}