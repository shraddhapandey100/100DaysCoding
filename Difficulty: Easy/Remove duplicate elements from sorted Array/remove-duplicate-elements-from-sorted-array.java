//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }
            Solution ob = new Solution();
            int ans = ob.removeDuplicate(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicate(List<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int n = arr.size();
        int count = 1; // Since the first element is always unique
        int i = 1; // Start from the second element

        for (int j = 1; j < n; j++) {
            if (!arr.get(j).equals(arr.get(j - 1))) {
                arr.set(i, arr.get(j));
                i++;
                count++;
            }
        }
        
        // Remove the remaining elements after the unique count
        while (arr.size() > count) {
            arr.remove(arr.size() - 1);
        }

        return count;
    }
}
