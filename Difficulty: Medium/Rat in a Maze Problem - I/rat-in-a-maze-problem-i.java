class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n-1][n-1] == 0) return ans;
        boolean[][] visited = new boolean[n][n];
        solveMaze(maze, 0, 0, n, "", visited, ans);
        Collections.sort(ans);
        return ans;
    }
    public void solveMaze(int[][] maze, int row, int col, int n, String path, boolean[][] visited, List<String> ans) {
        if(row == n-1 && col == n-1){
            ans.add(path);
            return;
        }
        if(row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || visited[row][col]){
            return;
        }
        visited[row][col] = true;
        solveMaze(maze, row + 1, col, n, path + "D", visited, ans);
        solveMaze(maze, row, col - 1, n, path + "L", visited, ans);
        solveMaze(maze, row, col + 1, n, path + "R", visited, ans);
        solveMaze(maze, row - 1, col, n, path + "U", visited, ans);
        visited[row][col] = false;
    }
}