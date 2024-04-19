//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        String str1 = s.toString();
        int n = str.length();
        int len = LCS(str, str1, n);
        int insertions = n -len;
        return insertions;
    }
    static int LCS(String s1, String s2, int n){
        int[][]dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            for(int j =0; j<=n; j++){
                if(i==0 || j==0){
                    dp[i][j] =0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}