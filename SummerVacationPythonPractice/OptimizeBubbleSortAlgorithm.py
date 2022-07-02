'''

Optimize version of BubbleSort Algorithm

function bubbleSort(array)
     swapped<- false
         for i<-1 to indexOfLastUnsortedElement- 1
             if leftElement> rightElement
                 swap leftElement and rightElement
                 swapped<- true
     end bubbleSort
     

'''

# Optimized Bubble Sort in Python

def bubbleSort(array):
    # loop through each element of array
    for i in range(len(array)):
        # keep track of swapping
        swapped = False

        # loop to compare array elements
        for j in range(0, len(array)-i-1):
            # Compare two adjacent elements
            # change > to < to sort in decending order

            if(array[j]> array[j+1]):
                # swapping occures if elements are not in the intend
                # order
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp

                swapped = True

            # No swapping means the array is already sorted so no need
            # for further comparison

            if not swapped:
                break
            
        
    
