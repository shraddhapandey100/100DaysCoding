//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(n, arr)); 
        }
    }
    
    
}
// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
     static long solveF(int i, int j, int n, int[] arr, long[][] dp) {
        if (i > j || i >= n || j < 0) {
            return 0;
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        long tookFirst = arr[i] + Math.min(solveF(i + 2, j, n, arr, dp), solveF(i + 1, j - 1, n, arr, dp));
        long tookLast = arr[j] + Math.min(solveF(i, j - 2, n, arr, dp), solveF(i + 1, j - 1, n, arr, dp));
        
        return dp[i][j] = Math.max(tookFirst, tookLast);
    }
    
    static long countMaximum(int n, int[] arr) {
        long[][] dp = new long[n + 1][n + 1];
        
        for (long[] cur : dp) {
            Arrays.fill(cur, -1);
        }
        
        return solveF(0, n - 1, n, arr, dp);
    }
}
