//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        // Return the difference between upper bound and lower bound of the target.
        return upperBound(arr, target) - lowerbound(arr, target);
    }
    static int lowerbound(int[] arr, int target){
        int res = arr.length;
        int lo =0, hi = arr.length -1;
        while( lo <= hi){
            int mid = lo + (hi -lo)/2;
            if(arr[mid] >= target){
                res = mid;
                hi = mid -1;
            }else{
                lo = mid +1;
            }
        }
        return res;
    }
    static int upperBound(int[]arr, int target){
        int res = arr.length;
        //Search space for binary search.
        int lo =0, hi = arr.length -1;
        while( lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > target){
                res = mid;
                hi = mid -1;
            }else{
                lo = mid +1;
            }
        }
        return res;
    }
}
