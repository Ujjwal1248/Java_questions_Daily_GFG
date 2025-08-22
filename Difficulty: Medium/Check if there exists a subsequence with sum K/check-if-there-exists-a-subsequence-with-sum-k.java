// User function Template for Java
class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        return helper(0, arr, 0, K);
    }

    private static boolean helper(int i, int[] arr, int sum, int K) {
        // Base case
        if(sum == K) return true; // Found subsequence
        if (i == arr.length || sum > K) return false;

        // Take the current element
        if (helper(i + 1, arr, sum + arr[i], K)) {
            return true;
        }

        // Skip the current element
        if (helper(i + 1, arr, sum, K)) {
            return true;
        }

        return false;
    }
}
