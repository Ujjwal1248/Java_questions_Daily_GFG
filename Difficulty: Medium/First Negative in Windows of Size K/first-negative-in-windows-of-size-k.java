class Solution {
	static List<Integer> firstNegInt(int arr[], int k) {
		// code here
		List<Integer> ll = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		int left = 0, right = 0;
		int n = arr.length;
		while (right < n) {
			if (arr[right] < 0)
				q.add(right);
			if (right - left + 1 == k) {
				if (!q.isEmpty())
					ll.add(arr[q.peek()]);
				else
					ll.add(0);
				if (!q.isEmpty() && left == q.peek())
					q.poll();
				left++;
			}
			right++;
		}
		return ll;
	}
}
