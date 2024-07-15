//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


class Solution {
    public String printString(String s, char ch, int count) {
        int i = 0;
        // Iterate over the string to find the count-th occurrence of ch
        while (count > 0 && i < s.length()) {
            if (s.charAt(i) == ch) {
                count--;
            }
            i++;
        }

        // If count is still greater than 0, it means ch was not found count times
        if (count > 0) {
            return ""; // or some other indication that the character was not found enough times
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder ans = new StringBuilder();

        // Append the remaining part of the string
        while (i < s.length()) {
            ans.append(s.charAt(i));
            i++;
        }

        return ans.toString();
    }
}
