class Solution {
    class Arr {
        int profit;
        int deadline;
        Arr(int profit, int deadline) {
            this.profit = profit;
            this.deadline = deadline;
        }
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = profit.length;

        ArrayList<Arr> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new Arr(profit[i], deadline[i]));
        }

        // Sort jobs by profit in descending order
        jobs.sort((a, b) -> b.profit - a.profit);

        // Find maximum deadline
        int maxDeadline = 0;
        for (Arr job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] slot = new int[maxDeadline + 1]; // 1-based indexing
        Arrays.fill(slot, -1);

        int count = 0;
        int totalProfit = 0;

        // Assign jobs to slots
        for (Arr job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = 1;
                    count++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(count);
        result.add(totalProfit);
        return result;
    }
}
