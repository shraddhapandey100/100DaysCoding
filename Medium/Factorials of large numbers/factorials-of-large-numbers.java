//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        
        int carry = 0;
        for(int i = 2 ; i <= n ; i++){
           for(int listIdx = list.size() - 1; listIdx >= 0 ; listIdx--){
               int product = (list.get(listIdx) * i) + carry;
               list.set(listIdx,product % 10);
               carry = product / 10;
           }
           
           while(carry != 0){
               list.add(0 , carry % 10);
               carry /= 10;
           }
        }
        
        return list;
    }
}