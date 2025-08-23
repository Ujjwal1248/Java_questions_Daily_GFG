class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        List<Integer>[] G = new ArrayList[v];
        for(int i = 0; i < v; i++) G[i] = new ArrayList<>();
        for(int[] e: edges){
            G[e[0]].add(e[1]);
            G[e[1]].add(e[0]);
        }
        int[] color = new int[v];
        return solve(0, G, color, m, v);
    }
    boolean solve(int node, List<Integer>[] G, int[] color, int m, int n) {
        if(node == n) return true;
        for(int c = 1; c <= m; c++){
            if(isSafe(node, G, color, c)){
                color[node] = c;
                if(solve(node + 1, G, color, m, n)) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    boolean isSafe(int node, List<Integer>[] G, int[] color, int c) {
        for(int it : G[node]){
            if(color[it] == c) return false;
        }
        return true;
    }
}