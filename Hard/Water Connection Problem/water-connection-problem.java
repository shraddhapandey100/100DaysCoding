//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            ArrayList<Integer> d = new ArrayList<Integer>();
            
            for(int i=0;i<p;i++)
            {
                a.add(sc.nextInt());
                b.add(sc.nextInt());
                d.add(sc.nextInt());
            }
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.solve(n, p, a, b, d); 
            System.out.println(ans.size());
            for (int i=0;i<ans.size();i++){ 
                System.out.println(ans.get(i).get(0)+" "+ans.get(i).get(1)+" "+ans.get(i).get(2)); 
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    
    public class House{
        int in;
        int out;
        int dia;
        House(int in,int out,int dia){
            this.in = in;
            this.out = out;
            this.dia = dia;
        }
        House(){
            
        }
    }
    ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
    { 
         HashMap<Integer,House> map = new HashMap<>();
         int in[] = new int[n+1];
         int out[] = new int[n+1];
         for(int i =0;i<p;i++){
             out[a.get(i)] = 1;
             in[b.get(i)] = 1;
             map.put(a.get(i),new House(a.get(i),b.get(i),d.get(i)));
         }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         for(int i =1;i<=n;i++){
             if(in[i] == 0 && out[i] == 1){
                 int s= i;
                 House curr = map.get(i);
                 int e = curr.out;
                 int dia = curr.dia;
                 while(map.containsKey(curr.out)){
                     curr = map.get(curr.out);
                     e = curr.out;
                     dia = Math.min(dia,curr.dia);
                 }
                 ArrayList<Integer> arr = new ArrayList<>();
                 arr.add(s);
                 arr.add(e);
                 arr.add(dia);
                 ans.add(arr);
             }
         }
         return ans;
     }
} 