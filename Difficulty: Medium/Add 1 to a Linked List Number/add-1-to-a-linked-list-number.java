//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // Step 1: Reverse the linked list to make addition easier.
        head = reverseList(head);
        //Step 2: Add one to the reversed list.
        Node current = head;
        int carry =1;// Initail carry is 1, as we are adding one to the number.
        while(current != null){
            int sum = current.data + carry;
            current.data = sum%10; // Update the node's data with the remainder.
            carry = sum/10; // calculate  new carry.
            // If there's no carray left, break out of the loop.
            if(carry ==0){
                break;
            }
            //Move to the next node.
            if(current.next == null && carry >0){
                //If we reach the end and still have a carry, we need to add a new node.
                current.next = new Node(carry);
                break;
            }
            current = current.next;
        }
        //Step 3: Reverse the list again to restore the original order.
        head = reverseList(head);
        return head;
        
    }
    // Helper function to reverse a linked list.
    private Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
