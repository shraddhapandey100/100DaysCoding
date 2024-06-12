//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countNumberswith4(int n) {
        // count how many numbers from 1 to n contain the digit '4'
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (containsDigitFour(i)) {
                result++;
            }
        }
        return result;
    }
    
    public static boolean containsDigitFour(int n) {
        while (n > 0) {
            if (n % 10 == 4) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}
