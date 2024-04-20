//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        int len =0;
        for(int i=0; i<S.length(); i++){
            char x = S.charAt(i);
            if(x == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    len = Math.max(len, i -stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        return len;
    }
}