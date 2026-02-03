class Solution {
    ArrayList<String> ans = new ArrayList<>();
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length;
        if (maze[0][0] == 0 || maze[n-1][n-1] == 0) return ans;
        helper(maze, 0, 0, "", new boolean[n][n], n);
        Collections.sort(ans);
        return ans;
    }
    public void helper(int[][] maze, int r, int c, String curr, boolean[][] visited, int n){
        if(r == n-1 && c == n - 1){
            ans.add(curr);
            return;
        }
        if(r<0 || c<0 || r>=n || c >= n || maze[r][c] == 0 || visited[r][c]) return;
        
        visited[r][c] = true;
        helper(maze, r + 1, c, curr+"D", visited, n);
        helper(maze, r - 1, c, curr+"U", visited, n);
        helper(maze, r , c+1, curr+"R", visited, n);
        helper(maze, r , c-1, curr+"L", visited, n);
        visited[r][c] = false;
    }
}