class Solution {
    int count = 0; // Global variable to keep track of the count of visited nodes.
    
    int kthLargest(Node root, int k) {
        if (root == null) {
            return -1; // Base case: If the tree is empty, return -1.
        }
        
        Node result = kthLargestUtil(root, k);
        
        if (result != null) {
            return result.data; // Return the data of the Kth largest element.
        }
        
        return -1; // Kth largest element not found.
    }
    
    Node kthLargestUtil(Node root, int k) {
        if (root == null) {
            return null;
        }
        
        // Recursively visit the right subtree first.
        Node right = kthLargestUtil(root.right, k);
        
        // If the Kth largest element is found in the right subtree, return it.
        if (right != null) {
            return right;
        }
        
        // Update the count of visited nodes.
        count++;
        
        // If the current node is the Kth largest element, return it.
        if (count == k) {
            return root;
        }
        
        // Otherwise, visit the left subtree.
        return kthLargestUtil(root.left, k);
    }
}
