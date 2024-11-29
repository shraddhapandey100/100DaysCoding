//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String addBinary(String A, String B) {
        // code here
        if(A.equals("0") && B.equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        int n = A.length();
        int m = B.length();
        int carry =0;
        while( n> 0 || m >0){
            int val1 = (n> 0)? A.charAt(n-1)-'0':0;
            int val2 = (m > 0)?B.charAt(m-1)-'0':0;
            int sum = val1 + val2 + carry;
            carry = sum/2;
            sb.append(sum%2);
            n--;
            m--;
        }
        if(carry == 1)sb.append(carry);
        sb.reverse();
        while(sb.charAt(0) == '0')sb.deleteCharAt(0);
        return sb.toString();
    }
}