//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList<Integer> res = T.boundaryTraversal(root);
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/



class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) return ans;

        // Add root (but avoid adding if it's a leaf, since leaves are handled separately)
        if (!isLeaf(node)) {
            ans.add(node.data);
        }

        // Add left boundary (excluding leaves)
        leftNodes(node.left, ans);

        // Add leaf nodes
        addLeaves(node, ans);

        // Add right boundary in reverse (excluding leaves)
        ArrayList<Integer> rightBoundary = new ArrayList<>();
        rightRevNodes(node.right, rightBoundary);
        for (int i = rightBoundary.size() - 1; i >= 0; i--) {
            ans.add(rightBoundary.get(i));
        }

        return ans;
    }

    // Helper function to check if a node is a leaf
    private boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    // Add left boundary (excluding leaf nodes)
    private void leftNodes(Node node, ArrayList<Integer> ans) {
        while (node != null) {
            if (!isLeaf(node)) {
                ans.add(node.data);
            }
            node = (node.left != null) ? node.left : node.right;
        }
    }

    // Add all leaf nodes (in-order traversal)
    private void addLeaves(Node node, ArrayList<Integer> ans) {
        if (node == null) return;
        if (isLeaf(node)) {
            ans.add(node.data);
            return;
        }
        addLeaves(node.left, ans);
        addLeaves(node.right, ans);
    }

    // Add right boundary in reverse order (excluding leaf nodes)
    private void rightRevNodes(Node node, ArrayList<Integer> ans) {
        while (node != null) {
            if (!isLeaf(node)) {
                ans.add(node.data);
            }
            node = (node.right != null) ? node.right : node.left;
        }
    }
}
