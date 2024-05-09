//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int arr[], int n)
    {
        // int count0 =0, count1=0, count2=0;
        // for(int i=0; i<n; i++){
        //     if(arr[i] == 0){
        //         count0++;
        //     }
        //     if(arr[i] == 1){
        //         count1++;
        //     }
        //     if(arr[i] == 2){
        //         count2++;
        //     }
        // }
        // int k=0;
        
        // while(count0>0){
        //     arr[k++]=0;
        //     count0--;
        // }
        // while(count1>0){
        //     arr[k++]=1;
        //     count1--;
        // }
        // while(count2>0){
        //     arr[k++]=2;
        //     count2--;
        // }
        int left =0;
        int mid =0;
        int right =n-1;
        while(mid <= right){
            if(arr[mid] == 0){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends