//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        int left =0, right = arr.length-1;
        int max_area = 0;
        int curr_area;
        while(left < right){
            curr_area = (right - left)*Math.min(arr[left] , arr[right]);
            max_area = max_area < curr_area? curr_area:max_area;
            if(arr[left]> arr[right]){ --right;}else{ ++left;}
        }
        return max_area;
    }
}