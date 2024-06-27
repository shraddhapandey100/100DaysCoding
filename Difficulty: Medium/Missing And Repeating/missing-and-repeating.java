//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int res[] = new int[2];
        int repeating =-1;
        int missing = -1;
        int hash[] = new int[n+1];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
        for(int j=1; j<n+1; j++){
            if(hash[j] == 2){
                repeating = j;
            }
            if(hash[j] == 0){
                missing = j;
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        res[0] = repeating;
        res[1] = missing;
        return res;
    }
}