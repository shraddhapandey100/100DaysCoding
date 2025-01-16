//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxLen(int[] arr) {
        // int res =0;
        // //Pick a starting point as 's'.
        // for(int s =0; s< arr.length; s++){
        //     int sum =0;
        //     //Consider all subarrays arr[s.. e].
        //     for(int e = s; e< arr.length; e++){
        //         sum+=(arr[e] ==0)?-1:1;
        //         if(sum==0){
        //             res = Math.max(res, e-s+1);
        //         }
        //     }
            
        // }
        // return res;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        int sum = 0;
        int max =0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            if(sum == 0){
                max = i+1;
                continue;
            }
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return max;
    }
}
