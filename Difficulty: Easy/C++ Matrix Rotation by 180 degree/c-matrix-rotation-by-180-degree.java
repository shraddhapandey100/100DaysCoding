//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < n; j++) matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.rotate(matrix);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        // Loop through half of the matrix
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N; j++) {
                // Swap the elements diagonally opposite to each other
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - i - 1][N - j - 1];
                matrix[N - i - 1][N - j - 1] = temp;
            }
        }

        // If N is odd, reverse the middle row
        if (N % 2 != 0) {
            int middle = N / 2;
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[middle][j];
                matrix[middle][j] = matrix[middle][N - j - 1];
                matrix[middle][N - j - 1] = temp;
            }
        }
    }
}