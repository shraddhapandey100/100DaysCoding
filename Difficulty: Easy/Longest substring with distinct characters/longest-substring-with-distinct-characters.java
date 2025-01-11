//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String S) {
         int ans=0;
        HashSet<Character>set= new HashSet<>();
        int i=0;
        int j=0;
        while(j <S.length()){
            char c = S.charAt(j);
            while(set.contains(c)){
                set.remove(S.charAt(i));
                i++;
            }
            set.add(c);
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}