class Solution {

    public int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Mark land cells connected to the boundary
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0);
            }
            if (grid[i][m - 1] == 1) {
                dfs(grid, i, m - 1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 1) {
                dfs(grid, 0, j);
            }
            if (grid[n - 1][j] == 1) {
                dfs(grid, n - 1, j);
            }
        }

        // Count the remaining land cells that are not connected to the boundary
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    // DFS function to mark land cells connected to the boundary
    private void dfs(int[][] grid, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;

        if (x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 0) {
            return;
        }

        grid[x][y] = 0; // Mark the cell as visited

        // Explore neighboring cells
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            dfs(grid, newX, newY);
        }
    }
}
