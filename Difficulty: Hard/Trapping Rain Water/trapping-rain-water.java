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


class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int trapped =0;
        //Array to store left Maximum boundary.
        int[]left = new int[n];
        left[0] = arr[0];
        // Calculate left maximum boundary.
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        //Array to store right maximum boundary.
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i>= 0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }for(int i=0; i<n; i++){
            // Calculating WaterLevel = min(left boundary, right boundary).
            int waterLevel = Math.min(left[i], right[i]);
            //Calculating trapped water = (waterLevel - high of the building)*width of building.
            trapped +=(waterLevel - arr[i])*1;
        }
        return trapped;
    }
}
