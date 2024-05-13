//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0; i<n; i++){
                      if(!check(a[i]))return 0;
                  }
                  return 1;
           }
           public static boolean check(int n){
               ArrayList<Integer> arr = new ArrayList<>();
               while(n>0){
                   arr.add(n%10);
                   n = n/10;
               }
               int i=0;
               int j = arr.size() -1;
               while( i<j){
                   if(arr.get(i) != arr.get(j)){
                       return false;
                   }
                   i++;
                   j--;
               }
               return true;
           }
           
}