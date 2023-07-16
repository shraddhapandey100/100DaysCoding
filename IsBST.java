class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    
    // Helper function to check if a binary tree is a BST
    private boolean isBSTUtil(Node node, int min, int max) {
        // Base case: an empty tree is considered a BST
        if (node == null)
            return true;
        
        // If the current node violates the BST property, return false
        if (node.data <= min || node.data >= max)
            return false;
        
        // Recursively check the left and right subtrees
        return isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max);
    }
    
    // Function to check if a binary tree is a BST
    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

public class Main {
    public static void main(String[] args) {
        // Construct the binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(3);
        
        // Check if the tree is a BST
        if (tree.isBST())
            System.out.println("The tree is a BST.");
        else
            System.out.println("The tree is not a BST.");
    }
}
