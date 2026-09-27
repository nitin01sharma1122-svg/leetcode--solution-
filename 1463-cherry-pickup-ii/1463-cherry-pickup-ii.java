class Solution {

    public int cherryPickup(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][][] dp = new int[n][m][m];

        for (int i = 0; i < n; i++) {
            for (int j1 = 0; j1 < m; j1++) {
                Arrays.fill(dp[i][j1], -1);
            }
        }

        return solve(0, 0, m - 1, grid, dp);
    }

    public int solve(int i, int j1, int j2, int[][] grid, int[][][] dp) {

        
        if (j1 < 0 || j1 >= grid[0].length ||
            j2 < 0 || j2 >= grid[0].length) {

            return Integer.MIN_VALUE;
        }

        
        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }

        
        if (i == grid.length - 1) {

            if (j1 == j2) {
                return dp[i][j1][j2] = grid[i][j1];
            }

            return dp[i][j1][j2] = grid[i][j1] + grid[i][j2];
        }

        
        int current;

        if (j1 == j2) {
            current = grid[i][j1];
        } else {
            current = grid[i][j1] + grid[i][j2];
        }

        int maxsum = Integer.MIN_VALUE;

        
        for (int d1 = -1; d1 <= 1; d1++) {

            for (int d2 = -1; d2 <= 1; d2++) {

                int ans = solve(
                    i + 1,
                    j1 + d1,
                    j2 + d2,
                    grid,
                    dp
                );

                maxsum = Math.max(maxsum, ans);
            }
        }

        
        return dp[i][j1][j2] = current + maxsum;
    }
}