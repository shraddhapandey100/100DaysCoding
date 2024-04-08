//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // As the given list contains some duplicate elements. so, first we have to remove that 
        // duplicate elements by making a set.
        Set<Integer> set = new HashSet<>(A);
        // deleting all the elements from the list.
        A.clear();
        // Adding all the unique elements in the list using set.
        A.addAll(set);
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer>inner = new ArrayList<>();
        combinations(result, inner, A, 0, B);
        return result;
    }
    static void combinations(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> inner, ArrayList<Integer> arr, int idx , int B){
        if(idx == arr.size()){
            if(B == 0){
                result.add(new ArrayList<>(inner));
            }
            return;
        }
        if(arr.get(idx) <=B){
            inner.add(arr.get(idx));
            combinations(result, inner, arr, idx, B-arr.get(idx));
            inner.remove(inner.size()-1);
        }
        combinations(result, inner, arr, idx +1, B);
    }
}