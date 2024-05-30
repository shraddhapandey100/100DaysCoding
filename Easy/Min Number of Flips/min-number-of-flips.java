//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String S) {
        return Math.min(solve(S, '0'), solve(S, '1'));
    }
    public static int solve(String str, char expected){
        int flipCount =0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) != expected){
                flipCount++;
            }
            expected = flip(expected);
        }
        return flipCount;
    }
    public static char flip(char ch){
        return (ch == '0')?'1':'0';
    }
}