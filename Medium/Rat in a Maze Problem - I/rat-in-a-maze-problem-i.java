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
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
         String temp = "";
        ArrayList<String> result = new ArrayList<>();
        boolean vis[][] = new boolean[n][n]; //to keep a track if a cell is visited
        backtrack(result, 0, 0, temp, m, n, vis);
        return result;
    }
     public static void backtrack(ArrayList<String> result,int i, int j, String temp, int[][] m, int n, boolean vis[][]) {

        if (i == n-1 && j == n-1 && m[i][j]!=0) //adding extra check, if my final dest is not blocked
        {
            result.add(temp);
            return;
        }
        if(i>=0 && i<n && j>=0 && j<n){
            if(vis[i][j]==true || m[i][j]==0)
                return;
                
                vis[i][j] = true;
                backtrack(result, i+1, j, temp + 'D', m,n, vis);
                backtrack(result, i, j-1, temp + 'L', m,n, vis);
                backtrack(result, i, j+1, temp + 'R', m,n, vis);
                backtrack(result, i-1, j, temp + 'U', m,n, vis);
                vis[i][j] = false;
        }
    }
    
}