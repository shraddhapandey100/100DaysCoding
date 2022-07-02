# Finding the absolute value using a function
# Without parameter and with the return value

def absolute_value(num):
    """ This function returns the absolute value of the entered number """
   
    if num >= 0:
        return num
    else:
        return -num

# Drive code
num = int(input("Enter the number either of -ve or +ve"))

print("The absolute value is", absolute_value(num)) # function call
