//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
         // Hash all the new ascii characters
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            hm.put(x[i], b[i]);
        }
        
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;
        int maxStart = 0, maxEnd = 0;
        int len = w.length();
        
        for(int i = 0; i < len; i++) {
            char ch = w.charAt(i);
            // If the new ascii value is present in the hash table, use it or use the default ascii value
            int charVal = hm.getOrDefault(ch, (int) ch);

            // Kadane's Algorithm 
            if(currSum + charVal > charVal) {
                currSum = currSum + charVal;
                end = i;
            } else {
                currSum = charVal;
                start = i; end = i;
            }
            
            if(currSum > maxSum) {
                maxSum = currSum;
                maxStart = start;
                maxEnd = end;
            }
        }
        
        return w.substring(maxStart, maxEnd + 1);
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends