class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] ans = new int[m][n];
        int x = 0, y = 0;
        
        for (int[] wall : walls) {
            x = wall[0];
            y = wall[1];
            
            ans[x][y] = -1;  
        }
    
        for (int[] grd : guards) {
            x = grd[0];
            y = grd[1];
            
            ans[x][y] = 1;
        }
        
        for (int[] grd : guards) {
            x = grd[0];
            y = grd[1];
            
            for (int i = y + 1; i < n; i++) {
                if (ans[x][i] == -1 || ans[x][i] == 1) {
                    break;
                }
                ans[x][i] = 2;
            }
            
            for (int i = x + 1; i < m; i++) {
                if (ans[i][y] == -1 || ans[i][y] == 1) {
                    break;
                }
                ans[i][y] = 2;
            }
            
            for (int i = y - 1; i >= 0; i--) {
                if (ans[x][i] == -1 || ans[x][i] == 1) {
                    break;
                }
                ans[x][i] = 2;
            }
            
            for (int i = x - 1; i >= 0; i--) {
                if (ans[i][y] == -1 || ans[i][y] == 1) {
                    break;
                }
                ans[i][y] = 2;
            }
        }
        
        int c = 0;
        
        for (int[] arr : ans) {
            for (int i : arr) {
                if (i == 0) {
                    c++;
                }
            }
        }
        
        return c;
    }
}