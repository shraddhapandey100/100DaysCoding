class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        // Base case: An empty array or a single element is considered as a Valid BST
        if(N<=1){
            return 1;
        }
        //Check if the given array is in non-decreasing order
        for(int i=0; i<N-1; i++){
            //Array is not in non-decreasing order , so it cannot represent an 
            // inorder traversal of a BST.
            if(arr[i]>= arr[i+1]){
                return 0;
            }
        }
        //Array is in non-decreasing order , so it an 
        // inorder traversal of a BST.
        return 1;
    }
}
