//{ Driver Code Starts
import java.util.*;
class Node
{
	Node next;
	int data;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Delete_Kth_Node
{
	Node head;
	Node tail;
	
	void addToTheLast(Node node){
		if(head == null){
		head = node;
		tail = node;
		}
		else
		{
		    tail.next = node;
		    tail = tail.next ;
		}
	}	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();		 
		 while(t>0)
         {
			int n = sc.nextInt();
			Delete_Kth_Node list = new Delete_Kth_Node();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				list.addToTheLast(new Node(a));
			}
			int k = sc.nextInt();					  
			//System.out.println(list.head.data+" "+ k);
			list.head = new Solution().delete(list.head,k); 
			Node temp = list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+ " ");
			    temp = temp.next;
			}
			System.out.println();
			t--;
		}
	}
}
// } Driver Code Ends


/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        Node prev_node = new Node(-1);
        Node temp_node = prev_node;
        prev_node.next = head;
        int count =1;
        while(temp_node.next !=null){
            if(count == k){
                temp_node.next = temp_node.next.next;
                count =0;
            }else{
                temp_node = temp_node.next;
            }
            count++;
        }
        return prev_node.next;
    }
}