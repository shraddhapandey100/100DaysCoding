//{ Driver Code Starts
import java.util.*;

class Partition_Arr_To_K_Subsets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			Solution g = new Solution();
			if(g.isKPartitionPossible(a,n,k)==true)
				System.out.println(1);
			else 
				System.out.println(0);
			
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method */

class Solution
{
    public boolean solve(int arr[], int n, int[] par){
        if(n == -1){
            for(int i =0;i<par.length-1;i++){
                if(par[i] != par[i+1]){
                    return false;
                }
            }
            return true;
        }
        
        for(int i = 0;i<par.length;i++){
            if(arr[n] <= par[i]){
                par[i] -= arr[n];
                if(solve(arr,n-1,par)){
                    return true;
                }
                par[i] += arr[n];
            }
        }
        
        return false;
    }
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
        if(n<k) return false;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += a[i];
        }
        if(sum%k != 0){ //if sum is not divisible by k
            return false;
        }
        
        int[] par = new int[k];
        for(int i = 0;i<k;i++){
            par[i] = sum/k;
        }
        
        return solve(a,n-1,par);
    }
}