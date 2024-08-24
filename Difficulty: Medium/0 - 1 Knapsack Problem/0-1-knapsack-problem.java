//{ Driver Code Starts
import java.io.*;
import java.util.*;

class gfg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int w = Integer.parseInt(br.readLine());

            String line = br.readLine();
            String[] tokens = line.split(" ");
            List<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] val = new int[array.size()];
            int idx = 0;
            for (int i : array) val[idx++] = i;

            String lin = br.readLine();
            String[] toke = lin.split(" ");
            List<Integer> array1 = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : toke) {
                array1.add(Integer.parseInt(token));
            }

            int[] wt = new int[array1.size()];
            idx = 0;
            for (int i : array1) wt[idx++] = i;

            // calling method knapSack() of class Solution
            System.out.println(new Solution().knapSack(w, wt, val));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int n = wt.length;
        //Create dp array.
        int dp[][] = new int[n+1][W +1];
        //For capacity 0 or non elements we have nothing to put or no capacity so 0.
        //Traverse.
        for(int i=1; i<=n; i++){
            //j is our current capacity.
            for(int j =1; j<=W; j++){
                // We have to take maximum items till now 
                // but we are not able to pick this item we picked the maximum ans which is 
                // Available above this item.
                int not_take = dp[i-1][j];
                int take =0;
                /*
                Check whether if we are able to pick this item bag capacity is equal to or
                greater to weight.
                */
                if(j >= wt[i-1]){
                    take = val[i-1] + dp[i-1][j- wt[i-1]];
                }
                dp[i][j] = Math.max(not_take , take);
            }
        }
        return dp[n][W];
    }
}
