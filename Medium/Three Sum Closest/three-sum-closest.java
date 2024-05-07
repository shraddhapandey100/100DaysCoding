//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        Arrays.sort(array);
        int closest = Integer.MAX_VALUE;
        int ans =0;
        int n = array.length;
        int i=0;
        while(i <n-2){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = array[i] + array[left]+ array[right];
                if(Math.abs(sum - target) < closest){
                    closest = Math.abs(sum - target);
                    ans = sum;
                }else if(Math.abs(sum - target) == closest && sum > ans){
                    ans = sum;
                }
                if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
            i++;
        }
        return ans;
	} 
} 
