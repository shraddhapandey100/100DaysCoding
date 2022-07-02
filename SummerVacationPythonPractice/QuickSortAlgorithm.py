'''
Pseudo Code:



function quickSort(left, right)
    if right- left<= 0:
        return
    else:
     pivot = A[right]
     partition = partitionFunc(left , right, pivot)
     quickSort( left, partition-1)
     quickSort(partition+1, right)
    end if


    
  end function


'''


# python code to implementation of quicksort


def partition(start, end , array):
    # Initialization pivot's index to start
    pivot_index= start
    pivot = array[pivot_index]


    '''
    This loop runs till start pointer crosses end pointer, and when it does we
    swap the pivot with element on end pointer.


    '''
    while start<end:
        '''
        Increment the start pointer till it finds an element greater than pivot


        '''
        while start<len(array) and array[start] <= pivot:
            start+=1
            

        while array[end]> pivot:
            end-= 1


        '''
        If start and end have not crossed each other,
        swap the numbers on start and end.

        '''

        if(start<end):
            array[start] , array[end] = array[end], array[start]


        '''

        Returning end pointer to divide the array into 2 half
        
        '''

        return end



# The main function that implements QuickSort
def quick_sort(start, end , array)
    if(start<end):
        '''
        P is partitioning index, array[p] is at right place

        '''
        p = partition(start, end, array)

        '''

        Sort elements before partition and after partition
        '''
        quick_sort(start, p-1, array)
        quick_sort(p+1, end , array)


quic
        

