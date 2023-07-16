
class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.   
        // Base case: If the tree is empty return null
        if(root ==null){
            return null;
        }
        if(root.data == n1|| root.data == n2){
            return root;
        }
        if(root.data >n1 && root.data >n2){
            //Both nodes are in the left subtree;
            return LCA(root.left, n1, n2);
        }else if(root.data <n1 && root.data <n2){
            //Both nodes are in the right subtree.
            return LCA(root.right, n1,n2);
        }else{
            // LCA found.
            return root;
        }
    }
    
}
/*
Time Complexity: O(Height of the BST).
Auxiliary Space: O(Height of the BST).
*/
