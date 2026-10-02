class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        
        return maxGold;
    }
    
    private int dfs(int[][] grid, int r, int c) {

        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        int currentGold = grid[r][c];
        grid[r][c] = 0;
        
        int maxNeighborGold = 0;

        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};
        
        for (int i = 0; i < 4; i++) {
            maxNeighborGold = Math.max(maxNeighborGold, dfs(grid, r + rowDir[i], c + colDir[i]));
        }

        grid[r][c] = currentGold;
        
        return currentGold + maxNeighborGold;
    }
}