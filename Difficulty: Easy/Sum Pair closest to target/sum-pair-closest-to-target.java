//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length==1)return ans;
        Arrays.sort(arr);
        int i=0;
        int j = arr.length -1;
        int left = arr[i];
        int right = arr[j];
        int minDiff = Math.abs(target - (right + left));
        while( i< j){
            int temp = arr[i] + arr[j];
            if(temp > target){
                int diff = Math.abs(target - (temp));
                if(diff < minDiff){
                    left = arr[i];
                    right = arr[j];
                    minDiff = diff;
                }
                j--;
            }else{
                int diff = Math.abs(target - (temp));
                if(diff < minDiff){
                    left = arr[i];
                    right = arr[j];
                    minDiff = diff;
                }
                i++;
            }
        }
        ans.add(left);
        ans.add(right);
        return ans;
    }
}