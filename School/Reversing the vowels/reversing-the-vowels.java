//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // convert the lowercase
        s.toLowerCase();
        // Get a array list of char 
        ArrayList<Character> vowel = new ArrayList<>();
        // String builder as strings are immutable.
        StringBuilder ss = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch =='i' || ch == 'o'|| ch == 'u'){
                vowel.add(ch);
            }
        }
        // Take the arraylist values from behind while any vowel appears in string to append that so it is in reverse order.
        int j = vowel.size()-1;
        for(int i=0; i<s.length(); i++){
            char chh = s.charAt(i);
            if(chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh =='u'){
                ss.append(vowel.get(j));
                j--;
            }else{
                ss.append(chh);
            }
        }
        return ss.toString();
        
    }
}