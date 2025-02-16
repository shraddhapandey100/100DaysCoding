//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void deletetree(Node root) {
        if (root == null) return;
        deletetree(root.left);
        deletetree(root.right);
        root.left = null;
        root.right = null;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Tree tr = new Tree();
            ArrayList<Integer> A = tr.serialize(root);
            deletetree(root);
            root = null;

            Node getRoot = tr.deSerialize(A);
            printInorder(getRoot);
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    
    ArrayList<String>ar2=new ArrayList<>();
    public void pre(Node root,ArrayList<Integer>ar){
        if(root==null){
            return;
        }
        ar.add(root.data);
        pre(root.left,ar);
        
        pre(root.right,ar);
    }
    
    public void preorder(Node root,ArrayList<String>ar2){
          if(root==null){
              ar2.add("null");
            return;
        }
        
        ar2.add(Integer.toString(root.data));
        preorder(root.left,ar2);
        
        preorder(root.right,ar2);
    }
    
    public ArrayList<Integer> serialize(Node root) {
        // code here
       ArrayList<Integer>ar=new ArrayList<>();  
         pre(root,ar);
         preorder(root,ar2);
         return ar;
    }

    // Function to deserialize a list and construct the tree.
    int itr=0;
    public Node pretraversal(ArrayList<String>ar){
        if(itr>ar.size()){
            return null;
        }
        
        if(ar.get(itr).equals("null")){
            itr++;
            return null;
        }
    Node node=new Node(Integer.parseInt(ar.get(itr)));
     itr++;
    node.left=pretraversal(ar);
    node.right=pretraversal(ar);
   
    return node;
    }
    public Node deSerialize(ArrayList<Integer> A) {
        // code here 
        // System.out.println(ar2);
       Node a= pretraversal(ar2);
        return a;
    }
};