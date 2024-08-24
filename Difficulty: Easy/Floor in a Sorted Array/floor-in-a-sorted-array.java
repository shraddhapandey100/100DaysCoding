//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Searching {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String a[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(a[0]);
            long x = Long.parseLong(a[(int)1]);
            String st[] = read.readLine().trim().split("\\s+");

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st[i]);
            }

            out.println(new Solution().findFloor(arr, n, x));
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int l =0, r = arr.length -1;
        int k = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == x){
                return mid; // If the element is equal to x, return the index.
            }else if(arr[mid] < x){
                k = mid; // Upper floor index.
                l = mid +1;
            }else{
                r = mid -1;
            }
        }
        return k;
    }
}
