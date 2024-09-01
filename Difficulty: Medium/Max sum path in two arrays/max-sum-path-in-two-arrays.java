//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int k = 0; k < t; k++) {
            List<Integer> arr1 = new ArrayList<>();
            String input = sc.nextLine();
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr1.add(lineScanner.nextInt());
            }
            lineScanner.close();

            List<Integer> arr2 = new ArrayList<>();
            input = sc.nextLine();
            lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr2.add(lineScanner.nextInt());
            }
            lineScanner.close();

            Solution ob = new Solution();
            int ans = ob.maxPathSum(arr1, arr2);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends

class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int ans = 0;
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum1 += arr1.get(i++);
            } else if (arr1.get(i) > arr2.get(j)) {
                sum2 += arr2.get(j++);
            } else {
                // Both are equal, choose the maximum path and reset sums
                ans += Math.max(sum1, sum2) + arr1.get(i);
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        // Include the remaining elements in sum1 or sum2
        while (i < arr1.size()) {
            sum1 += arr1.get(i++);
        }

        while (j < arr2.size()) {
            sum2 += arr2.get(j++);
        }

        // Add the maximum of the remaining sums to the answer
        ans += Math.max(sum1, sum2);

        return ans;
    }
}
