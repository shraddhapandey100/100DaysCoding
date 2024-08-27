//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int maxDiff = 0;
        for(int i=0; i<n; i++){
            int leftSmaller =0;
            int rightSmaller =0;
            //Find left smaller.
            for(int j = i-1; j>=0; j--){
                if(arr[j] < arr[i]){
                    leftSmaller = arr[j];
                    break;
                }
            }
            //Find right smaller.
            for(int j= i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    rightSmaller= arr[j];
                    break;
                }
            }
            maxDiff= Math.max(maxDiff, Math.abs(leftSmaller - rightSmaller));
        }
        return maxDiff;
    }
}
