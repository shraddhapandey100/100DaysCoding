//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[n-1];
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(first.length() , last.length());
        for(int i=0;i<minLength; i++){
            if(first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString().isEmpty()? "-1": sb.toString();
    }
}