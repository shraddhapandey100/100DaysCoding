//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] a = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.longestSubseq(n, a);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int longestSubseq(int n, int[] a) {
        int[] dp = new int[n];
        //Initialize the dp array with 1.
        for(int i=0; i<n; i++){
            dp[i] =1;
        }
        // Fill the dp array.
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(Math.abs(a[i] -a[j]) == 1){
                    dp[i] = Math.max(dp[i], dp[j]+ 1);
                }
            }
        }
        int maxLen =0;
        for(int i=0; i<n; i++){
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}
