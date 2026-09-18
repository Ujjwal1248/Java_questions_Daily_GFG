class Solution {
	public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
		// code here
		int[][] arr = new int[s.length][3];
		for (int i = 0; i < s.length; i++) {
			arr[i][0] = s[i];
			arr[i][1] = f[i];
			arr[i][2] = i + 1;
		}
		Arrays.sort(arr, (a, b) -> {if (a[1] != b[1]) {
			return a[1] - b[1];
		}
		return a[2] - b[2];
	});
	int prevEnd = -1;
	ArrayList<Integer> ans = new ArrayList<>();
	for (int[] num : arr) {
		int start = num[0];
		int end = num[1];
		int idx = num[2];
		if (start > prevEnd) {
			ans.add(idx);
			prevEnd = end;
		}
	}
	Collections.sort(ans);
	return ans;
}
}
