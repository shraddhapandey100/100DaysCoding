//ALGORITHM

// Sort The array first and increment the iterator ' i ' until you dont get an element >= 1.

// if the element is bigger than 1 -> return 1;

// if element == 1 ->

// increment iterator ' i ' until arr[i+1] == arr[i] + 1 or arr[i+1] == arr[i]

// once the above condition fails -> return arr[i]+1;


class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int i=0;
        int temp =1;
        while(i<size){
            if(arr[i]>temp)return temp;
            else if(arr[i] ==temp){
                temp++;
                
            }
            i++;
        }
        return temp;
    }
}
