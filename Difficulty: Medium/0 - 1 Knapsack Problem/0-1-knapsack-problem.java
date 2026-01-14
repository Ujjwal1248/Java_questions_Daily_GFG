class Solution {
    int[][] dp;

    public int knapsack(int W, int val[], int wt[]) {
        dp = new int[wt.length][W + 1];

        for (int i = 0; i < wt.length; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        return Knapsack(wt, val, W, 0);
    }

    public int Knapsack(int[] wt, int[] val, int W, int i) {
        if (W == 0 || i == wt.length) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int inc = 0, exc;
        if (W >= wt[i]) {
            inc = val[i] + Knapsack(wt, val, W - wt[i], i + 1);
        }
        exc = Knapsack(wt, val, W, i + 1);

        return dp[i][W] = Math.max(inc, exc);
    }
}
