//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends

class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;
        if (n == 0 || mat[0][0] == 0 || mat[n-1][n-1] == 0) {
            return ans;
        }
        boolean[][] vis = new boolean[n][n];
        dfs(mat, 0, 0, vis, "", ans);
        return ans;
    }

    private void dfs(int[][] mat, int i, int j, boolean[][] vis, String path, ArrayList<String> ans) {
        int n = mat.length;
        // Base cases
        if (i < 0 || j < 0 || i >= n || j >= n || mat[i][j] == 0 || vis[i][j]) {
            return;
        }
        if (i == n-1 && j == n-1) {
            ans.add(path);
            return;
        }
        
        vis[i][j] = true;

        // Move in all four directions
        dfs(mat, i, j+1, vis, path + "R", ans); // Move right
        dfs(mat, i, j-1, vis, path + "L", ans); // Move left
        dfs(mat, i-1, j, vis, path + "U", ans); // Move up
        dfs(mat, i+1, j, vis, path + "D", ans); // Move down

        vis[i][j] = false;
    }
}
