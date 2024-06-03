//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int numberOfConsecutiveOnes(int n) {
        //Define the modulo constant as 1e9 +7
        int mod = 1000000007;
        // Initialize an array to store the number of valid binary strings for each  length up to n.
        int[] dp = new int[n+1];
        // Base case initialization.
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        if(n < 3){
            return dp[n];
        }
        int a =0;
        int b = 1;
        for(int i=3; i<=n; i++){
            int c = (a+b)%mod;
            dp[i] = ((dp[i-1]*2)%mod +c)%mod;
            a=b;
            b= c;
        }
        return dp[n];
    }
}
