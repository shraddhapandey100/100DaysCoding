//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        // Check each row for palindrome 
        for(int i=0; i<n; i++){
            if(isPalindrome(arr[i])){
                return i+" R";
            }
        }
        //Check each column for palindrome
        for(int j=0; j<m; j++){
            int[] column = new int[n];
            for(int i=0; i<n; i++){
                column[i] = arr[i][j];
            }
            if(isPalindrome(column)){
                return j +" C";
            }
        }
        return "-1";
    }
    private static boolean isPalindrome(int[] arr){
        int left =0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
