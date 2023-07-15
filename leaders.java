class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
       ArrayList<Integer> leaders = new ArrayList<>();
        
        // Base case: If the array has only one element,
        // it is the leader, so add it to the list and return
        if (n == 1) {
            leaders.add(arr[0]);
            return leaders;
        }
        
        int maxRight = arr[n - 1]; // Rightmost element is always a leader
        leaders.add(maxRight);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }
        
        // Reverse the list to get the leaders in order of their appearance
        int left = 0;
        int right = leaders.size() - 1;
        while (left < right) {
            int temp = leaders.get(left);
            leaders.set(left, leaders.get(right));
            leaders.set(right, temp);
            left++;
            right--;
        }
        
        return leaders;
    }
}
