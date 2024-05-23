//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	   if(n<3){
             return -1;
         }
         //now n>=3
         int largest = -1;
         int index = 0;
         for(int i=0;i<2;i++){
             largest = -1;
             for(int j=0;j<n;j++){
                 if(a[j]>largest){
                     largest = a[j];
                     index = j;
                 }
             }
             a[index]=-1;
         }
         largest = -1;
         for(int j=0;j<n;j++){
            if(a[j]>largest){
                largest = a[j];
            }
        }
         
         
         
         return largest;
    }
}
