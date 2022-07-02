# Finding the absolute value using a function
# With parameter and without the return value

def absolute_value(num):
    """ This function returns the absolute value of the entered number """
    if num >= 0:
        print("The absolute value is:", num)
    else:
        print("The absolute value is:", -num)

# Drive code
num = int(input("Enter the number either of -ve or +ve"))
absolute_value(num) # Function call
