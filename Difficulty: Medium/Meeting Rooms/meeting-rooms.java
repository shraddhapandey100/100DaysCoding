//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                String temp[] = br.readLine().trim().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                String x = temp[1];
                arr[i][1] = Integer.parseInt(x);
            }
            Solution obj = new Solution();
            boolean ans = obj.canAttend(arr);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
         // Your code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int x,y,temp;
        for(int i=0;i<arr.length;i++){
            x = arr[i][0];
            y = arr[i][1];
            if(map.get(x)==null){
                map.put(x,y);
            }else{
                return false;
            }
        }
        temp = -1;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getKey()>=temp){
                temp = e.getValue();
            }else{
                return false;
            }
        }
        return true;
    }
}