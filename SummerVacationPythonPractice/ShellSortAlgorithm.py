'''

Shell sort is a highly efficient sorting algorithm and is based on insertion sort
algorithm

This algorithm avoids large shifts as in case of insertion sort, if the smaller
value is to the far right and has to be moved to the far left.

This algorithm uses insertion sort on a widely spread elements, first to sort them
sorts the less spaced elements. This spaced elements. This spacing is termed as interval

This interval is calculated based on Knuth's formula as,

h = (h*3)+1
Where : h is interval with initaial value 1



function shellSort()
    A: array of items

    # Calculate interval

    while interval< A.length/3 do:
        interval = interval*3+1

    end while

    while interval > 0 do:
        for outer = interval;
        outer < A.length ; outer++ do:

        # select value to be inserted
        valueToInsert = A[outer]

        inner = outer

            # Shift element towards right

            while inner > interval -1 && A[inner- interval] >= valueToInsert do:
                A[inner] = A[inner - interval]

                inner = inner - interval


            end while

            # insert the number at hole position

            A[inner] = valueToInsert

        end for

        # calculate interval


        interval = (interval-1)/3



            







'''
