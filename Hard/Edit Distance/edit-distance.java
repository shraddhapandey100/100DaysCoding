//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        int N = s.length();
        int M = t.length();
        int dp[][] = new int[N+1][M+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return count(N, M, s, t, dp);
    }
    int count(int n, int m, String S, String T, int dp[][]){
        if(n == 0)return m;
        if(m== 0)return n;
        if(dp[n][m] != -1)return dp[n][m];
        if(S.charAt(n-1) == T.charAt(m-1)){
            return dp[n][m] = count(n-1, m-1, S, T, dp);
        }
        int insert = 1+ count(n, m-1, S, T, dp);
        int del = 1+ count(n-1, m, S, T, dp);
        int replace = 1 + count(n-1, m-1, S, T, dp);
        return dp[n][m] = Math.min(insert, Math.min(del, replace));
    }
}