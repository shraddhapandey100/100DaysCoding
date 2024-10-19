//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        // Complete the function
       int n = str.length();
       char[] arr = str.toCharArray();
       if(arr[n-1] <= '5'){
           arr[n-1] = '0';
           return new String(arr);
       }
       arr[n-1] ='0';
       int i = n-2;
       while(i>=0 && arr[i] == '9'){
           arr[i] = '0';
           i--;
       }
       if(i<0){
           return '1'+ new String(arr);
       }else{
           arr[i]++;
       }
       return new String(arr);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends