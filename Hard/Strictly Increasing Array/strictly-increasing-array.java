//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            long ans = ob.min_operations(nums);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int min_operations(int []nums)
    {
        int n = nums.length;
        int LIS[] = new int[n];
        int len = 1;
        // Make all elements of LIS as 1.
        for(int i=0; i<n; i++){
            LIS[i] =1;
        }
        for(int i=1; i<n; i++){
            for(int j =0; j<i; j++){
                if(nums[i] > nums[j] && (i-j) <= nums[i] - nums[j]){
                    LIS[i] = Math.max(LIS[i] , LIS[j] +1);
                }
                len = Math.max(len, LIS[i]);
            }
        }
        return n-len;
    }
}