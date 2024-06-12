//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int b[] = new int[m];
      for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
      }
      
      Solution obj = new Solution();
      int ans = obj.maxChildren(n, m,a, b);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxChildren(int N,int M,int greed[], int sz[]) {
   // Sort both the greed and size arrays
        Arrays.sort(greed);
        Arrays.sort(sz);

        int i = 0, j = 0;
        int contentChildren = 0;

        // Use two pointers to find the maximum number of content children
        while (i < N && j < M) {
            if (sz[j] >= greed[i]) {
                // The current cookie satisfies the current child's greed
                contentChildren++;
                i++; // Move to the next child
            }
            // Move to the next cookie in any case
            j++;
        }

        return contentChildren;

  }
}
     