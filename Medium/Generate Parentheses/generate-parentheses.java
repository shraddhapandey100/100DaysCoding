//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        solve("", n, 0, 0, 0, ans);
        return ans;
    }
    public static void solve(String curr, int n, int i, int open, int close, List<String> ans){
        if(i == 2*n){
            ans.add(curr);
            return;
        }
        if(open <n){
            curr = curr +'(';
            solve(curr, n, i+1, open+1, close, ans);
            curr = curr.substring(0, curr.length() -1);
        }
        if(close <open){
            curr = curr +')';
            solve(curr, n, i+1, open, close+1, ans);
        }
        
    }
}