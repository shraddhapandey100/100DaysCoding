//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void dfs(int i, int j, int n, int m, int grid[][], StringBuilder sb){
        if(i<0 || i>= n|| j<0|| j>=m || grid[i][j] != 1){
            return;
        }
        grid[i][j] =2;
        dfs(i+1, j, n, m, grid, sb);
        sb.append('d');
        dfs(i, j+1, n, m, grid, sb);
        sb.append('r');
        dfs(i-1, j, n,m,grid, sb);
        sb.append('u');
        dfs(i, j-1, n, m, grid, sb);
        sb.append('l');
    }

    int countDistinctIslands(int[][] grid) {
        Set<String> dist = new HashSet<>();
        int n  = grid.length, m = grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    StringBuilder sb = new StringBuilder();
                    dfs(i, j, n, m, grid, sb);
                    dist.add(sb.toString());
                }
            }
        }
        return dist.size();
    }
    
}
