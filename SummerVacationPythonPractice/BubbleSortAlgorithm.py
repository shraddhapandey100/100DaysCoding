'''
Bubble Sort Algorithm is used to arrange N elements in ascending order, and for
that, you have to begin with 0th element and compare it with the first element.
If the 0th^element is found greater than the 1st^element, then the swapping operation
will be performed, that is the two values will get interchanged.

In this way, all the elements of the array get compared.


function bubbleSort(list: array of items)

    loop = list.count;
    for i= 0 to loop-1 do:
    swapped = false

    for j =0 to loop-1 do
        if list[j] > list[j+1] then
            swap( list[j] , list[j+1])
                swapped = true
        end if
    end for


    # if no number was swapped that means arrray is sorted now, break
    the looop



    if(not swapped ) then
        break
    end if

    end for

end function
    return list
    

'''


# python program for implementation of BubbleSort


def bubbleSort(array):

    # loop to compare array elements
    for i in range(len(array)-i-1):
        # Compare two adjacent elements
        #Change> to< sort in decending order

        if array[j]> arrray[j+1]:
            # Swapping elements if elements are not in the intended order
            temp = array[j]
            array[j]= array[j+1]
            array[j+1] = temp
            


