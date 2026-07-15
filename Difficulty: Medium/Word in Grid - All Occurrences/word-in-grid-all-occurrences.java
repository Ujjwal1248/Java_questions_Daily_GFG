class Solution {
	public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
		// code here
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == word.charAt(0)) {
					boolean r = check(mat, word, i, j);
					if (r) {
						ArrayList<Integer> curr = new ArrayList<>();
						curr.add(i);
						curr.add(j);
						res.add(curr);
					}
				}
			}
		}
		return res;
	}
	public boolean check(char[][] mat, String word, int i, int j) {
	    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		for (int d = 0; d < 8; d++) {
			int x = i, y = j;
			int k;
			for (k = 0; k < word.length(); k++) {
				if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length)
					break;
				if(mat[x][y] != word.charAt(k)) break;
				x += dx[d];
				y += dy[d];
			}
			if(k == word.length()) return true;
		}
		return false;
	}
};
