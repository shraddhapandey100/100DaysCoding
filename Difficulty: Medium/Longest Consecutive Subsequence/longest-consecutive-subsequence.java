//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        // Arrays.sort(arr);
        // int res =1, cnt =1;
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] == arr[i-1]){
        //         continue;
        //     }else if(arr[i] == arr[i-1] +1){
        //         cnt++;
        //     }else{
        //         cnt =1;
        //     }
        //     res = Math.max(res, cnt);
        // }
        // return res;
        Set<Integer> st = new HashSet<>();
        int res =0;
        //Hash all the array elements.
        for(int val: arr){
            st.add(val);
        }
        //Check each possible sequence from the start then update optional length.
        for(int val : arr){
            if(st.contains(val) && !st.contains(val -1)){
                //Then check for next elements in the sequence.
                int cur =val, cnt =0;
                while(st.contains(cur)){
                    st.remove(cur);
                    cur++;
                    cnt++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}