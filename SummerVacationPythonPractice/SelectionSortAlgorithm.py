'''
    Selection sort is a sorting algorithm that selects the smallest element
    from an unsorted list in each iteration and places that element at the begining
    of the unsorted list.



Pseudo Code:




function selection sort
     list: array of items
     n : size of list

     for i = 1 to n-1

     # set current element as minimum

     min = i

     # check the element to be minmum


     for j = i+1 to n
         if list[j] < list[min] then
             min = j;
          end if
 end for



    #  swap the minimum element with the current element

    if indexMin!= i then
       swap list[min] and list[i]
    end if
end  for

end function



'''



# Selection sort in Python

def selectionSort(array, size):

    for step in range(size):
        min_idx = step

        for i in range(step+1, size):

            # To start in decending order, change > to < in this line
            # select the minimum element in each loop

            if array[i] < array[min_idx]:
                mid_idx= i

        # put min at the correct position

        (array[step] , array[min_idx]) = (array[min_idx] , array[ste])
     
