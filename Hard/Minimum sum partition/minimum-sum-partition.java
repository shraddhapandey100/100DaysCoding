//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum = 0;
        for (int a : arr) sum += a;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialize the first column as true since we can achieve a sum of 0 with an empty subset.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the dp array to compute the possible subset sums.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (arr[i - 1] <= j) {
                    dp[i][j] |= dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        // Find the minimum difference between two subset sums.
        int minDiff = Integer.MAX_VALUE;
        for (int j = sum / 2; j >= 0; j--) {
            if (dp[n][j]) {
                minDiff = sum - 2 * j;
                break;
            }
        }

        return minDiff;
	} 
}
