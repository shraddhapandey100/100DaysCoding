//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        int[] temp = new int[2*K];
        for(int i =0 ; i<2*K ;i = i+2){
            temp[i] = Integer.MIN_VALUE;
        }
        for(int i =0 ; i < N;i++){
            temp[0] =Math.max(temp[0], -1 * A[i]);
            for(int j = 1 ; j < 2*K ;j++){
                temp[j] = Math.max(temp[j] , temp[j-1] + (j%2 ==1 ? A[i]:(-1*A[i])));
            }
        }
        return temp[(2*K)-1];
    }
}