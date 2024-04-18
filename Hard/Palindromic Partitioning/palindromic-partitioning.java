//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        int n = str.length();
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return count(0, n, str , dp)-1;
    }
    static int count(int i, int n, String str, int dp[]){
        if(i == n)return 0;
        if(dp[i] != -1) return dp[i];
        int ans = Integer.MAX_VALUE;
        for(int j = i; j<n; j++){
            if(isPalindrome(str, i, j)){
                int cost = 1 + count(j+1, n,str, dp);
                ans = Math.min(ans, cost);
            }
        }
        return dp[i] = ans;
    }
    static boolean isPalindrome(String str , int i, int j){
        while(i< j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}