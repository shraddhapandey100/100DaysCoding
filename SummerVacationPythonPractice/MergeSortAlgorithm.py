'''

function mergesort(var a as array)
    if(n==1) return a

    var 11 as array = a[0]... a[n/2]

    var 12 as array = a[n/2+1] ... a[n]
    ll = mergesort(11)
    12 = mergesort(12)

        return merge (11, 12)
    end produre


    procedure merge(var a as array , var b as array)

    var c as array

    while (a and b have elements)
        if(a[0]> b[0])
            add b[0] to the end of c
            remove b[0] from b

        else:
            add a[0] to the end of c
            remove a[0] from a

    end while

    return c

end function
        


'''





# Python program for implementation of MergeSort


def mergeSort(arr):
    if len(arr) > 1:
        # finding the mid of the array

        mid = len(arr)//2


        # dividing the array elements into 2 halve

        L= arr[: mid]


        R= arr[mid:]


        # Sorting the first half

        mergeSort(L)

        # Sorting the second half

        mergeSort(R)


        i= j= k= 0

        # Copy data to temp arrays l[] and R[]

        while i< len(L) and j< len(R):
            if L[i] <R[j]:
                arr[k] = L[i]
                i+=1

            else:
                arr[k] = R[j]

                j+= 1

            k + =1

        # Checking if any element was lef

        while i< len(L):
            arr[k] = L[i]
            i+= 1
            k+= 1


        while j < len(R):
            arr[k] = R[j]

            j+= 1
            k+= 1



# Code to print the list


def printList (arr):
    for i in range(len(arr)):
        print(arr[i], end= "")
    print()






            
            

        

        




        
