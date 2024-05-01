//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] inputline = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            Solution ob =new Solution();
            int[] res = ob.maxOfMin(arr, n);
            
            for (int i = 0; i < n; i++) 
                System.out.print (res[i] + " ");
            System.out.println ();
        }
    }
}
// } Driver Code Ends



class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) 
    {
        // Your code here
        int[] leftmin=new int[n];
        int[] rightmin=new int[n];    
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        //next left min
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            leftmin[i]=s1.isEmpty()?-1:s1.peek();
            s1.push(i);
        }
        //next right min
        for(int i=n-1;i>=0;i--){
            while(!s2.isEmpty() && arr[s2.peek()]>=arr[i]){
                s2.pop();
            }
            rightmin[i]=s2.isEmpty()?n:s2.peek();
            s2.push(i);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int subArrayLen=rightmin[i]-leftmin[i]-1;
            res[subArrayLen-1]=Math.max(arr[i],res[subArrayLen-1]);
        }
        
        
        for(int i=n-2;i>=0;i--){
            if(res[i]<res[i+1]){
                res[i]=res[i+1];
            }
        }
        return res;
    }
}