'''
Insertion sort is a sorting algorithm that places an unsorted element at
its suitable place in each iteration
Insertion sort works similary as we sort cards in our hand in a card game.
We assume that the first card is already sorted then , we select an unsorted
card is greater than the card in hand, it is placed on the right otherwise, to the left



'''


fuction insertionSort ( A: array of items)
    int holePosition
    int valueToInsert

        for i = 1 to length(A) inclusive do:
            # select value to be inserted

            valueToInsert= A[i]
            holePosition = i

            # locate hole position for the element to be inserted

            while holePosition> 0 and A[holePosition-1] > valueToInsert do:
                A[holePosition] = A[holePosition-1]
                holePosition = holePosition-1
            end while


            # insert the number at hole position

            A[holePosition] = valueToInsert

        end for

    end function


    
