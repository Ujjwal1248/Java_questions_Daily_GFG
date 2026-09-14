class Solution {
	public ArrayList<Integer> twoSum(int[] arr, int target) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int currSum = arr[left]+arr[right];
			if (currSum == target) {
				ans.add(left + 1);
				ans.add(right + 1);
				return ans;
			}
			else if (currSum < target)
				left++;
			else
				right--;
		}
		ans.add(-1);
		ans.add(-1);
		return ans;
	}
}
