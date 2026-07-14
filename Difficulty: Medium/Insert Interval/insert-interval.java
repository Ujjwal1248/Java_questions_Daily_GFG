class Solution {
	public ArrayList<int[]> insertInterval(int[][] nums, int[] newInterval) {
		// code here
		ArrayList<int[]> ans = new ArrayList<>();
		int[] arr = new int[2];
		for (int[] num : nums) {
			if(newInterval[0] > num[1]) ans.add(num);
			else if(newInterval[1] < num[0]){
			    ans.add(newInterval);
			    newInterval = num;
			}
			else{
			    newInterval[0] = Math.min(num[0], newInterval[0]);
			    newInterval[1] = Math.max(num[1], newInterval[1]);
			}
		}
		ans.add(newInterval);
		return ans;
	}
}
