class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        int repeating = -1;

        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            int idx = val - 1;

            if (arr[idx] < 0) {
                repeating = val;
            } else {
                arr[idx] *= -1;
            }
        }

        ans.add(repeating);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
                break;
            }
        }

        return ans;
    }
}