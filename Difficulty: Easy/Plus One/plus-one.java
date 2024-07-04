//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // Initialize carry to 1 since we are incrementing the number
        int carry = 1;
        
        // Traverse the list from the end to the beginning
        for (int i = N - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);  // Set the current digit
            carry = sum / 10;  // Update the carry
        }
        
        // If there is any carry left, add it to the front
        if (carry > 0) {
            arr.add(0, carry);
        }
        
        return arr;
    }
};