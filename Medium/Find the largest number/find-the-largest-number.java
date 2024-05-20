//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.find(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int find(int N){
        for(int i= N; i>=1; i--){
            if(isit(i)){
                return i;
            }
        } 
        return -1;
    }
    private static boolean isit(int num){
        int ele =9;
        while(num > 0){
            int digit = num%10;
            if(digit <= ele){
                ele = digit;
                num/=10;
            }else{
                return false;
            }
        }
        return true;
    }
}