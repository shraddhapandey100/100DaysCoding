//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int a[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int f = 0;
            String A = obj.minSum(a);
            System.out.println(A);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String minSum(int[] arr) {
        // code here
        int c=0;
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder("");
        for(int i=arr.length-1; i>0; i-=2){
            sb.append(String.valueOf((c+arr[i]+arr[i-1])%10));
            c=(c+arr[i]+arr[i-1])/10;
        }
        if(arr.length%2!=0){
            sb.append(String.valueOf((c+arr[0])%10));
            c=(c+arr[0])/10;
        }
        if(c!=0)
        sb.append(c);
        while(sb.charAt(sb.length()-1)=='0')
        sb.deleteCharAt(sb.length() - 1);
        return sb.reverse().toString();
    }
}
