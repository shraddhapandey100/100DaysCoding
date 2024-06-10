//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(n, nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        HashSet<Character> set = new HashSet<>();
        
        for(char ch:nuts){
            set.add(ch);
        }
        HashMap<Integer,Character> map = new HashMap<>();
        map.put(0, '!');
        map.put(1, '#');
        map.put(2, '$');
        map.put(3, '%');
        map.put(4, '&');
        map.put(5, '*');
        map.put(6, '?');
        map.put(7, '@');
        map.put(8, '^');
        
        int j= 0;
        for(int i=0;i<map.size();i++){
            char ch = map.get(i);
            if(set.contains(ch) && j<n){
                nuts[j] = ch;
                bolts[j] = ch;
                j++;
            }
        }
        
    }
}
