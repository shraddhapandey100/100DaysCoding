//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int n = mat.length;
        // The graph needs not be constructed as the edges can be found by using knows function.
        // Degree Array.
        int[] indegree = new int[n];
        int[] outdegree = new int[n];
        // Query for all edges.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = knows(i, j, mat) ? 1 : 0;
                // Set the degrees.
                outdegree[i] += x;
                indegree[j] += x;
            }
        }
        // Find a person with indegree n-1 and outdegree 0.
        for (int i = 0; i < n; i++) {
            if (indegree[i] == n-1 && outdegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    // Function to check if person 'a' knows person 'b'.
    static boolean knows(int a, int b, int[][] matrix) {
        return matrix[a][b] == 1;
    }
}
