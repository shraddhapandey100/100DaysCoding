//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int edges[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                s = in.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(s[0]);
                edges[i][1] = Integer.parseInt(s[1]);
            }
            Solution ob = new Solution();
            List<List<Integer>> A = ob.printGraph(n, edges);
            for (var i : A) {
                Collections.sort(i);
                for (int j : i) {
                    out.print(j + " ");
                }
                out.println();
            }
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> mainList = new ArrayList<>();
        HashMap<Integer, List<Integer>> hm  = new HashMap<>();
        for(int i=0; i<V; i++){
            hm.put(i, new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int key = edges[i][0];
            int key2 = edges[i][1];
            if(hm.containsKey(key)){
                hm.get(key).add(key2);
            }
            if(hm.containsKey(key2)){
                hm.get(key2).add(key);
            }
        }
        for(int i=0; i<V; i++){
            if(hm.containsKey(i)){
                mainList.add(hm.get(i));
            }
        }
        return mainList;
    }
}