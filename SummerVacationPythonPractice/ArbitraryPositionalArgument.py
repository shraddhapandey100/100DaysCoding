# Sum of n numbers

def add(*b):
    result= 0

    for i in b:
        result = result+i
    return result

# Drive Code

# Function Call Method 1

print(add(10,20,30,40,50))


# Function Call Method 2

print(add(10,20,30))



