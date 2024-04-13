//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int majorityElement(int a[], int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Loop through each element in the array
        for(int i = 0; i < size; i++){
            if(map.containsKey(a[i])){
                // Increment the count correctly by 1
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                // Initialize the count to 1 if the element is not yet in the map
                map.put(a[i], 1);
            }
        }

        // Check each key in the map to find the majority element
        for(int key: map.keySet()){
            if(map.get(key) > size / 2)
                return key; // Return the key if it is the majority element
        }

        return -1; // Return -1 if no majority element found
    }
}
