# Defining a function to calculate LCM with default values.




def calculate_lcm(x=10,y=21): # It takes the actual parameter
    print("The value of x is:", x, "The value of y is", y)
    # To know the value of x & y
    # Selecting the greater number.
    if x>y:
        greater = x
    else:
        greater = y
    while(True):
        if(greater%x==0) and (greater%y==0):
            lcm = greater
            break
        greater +=1
    return lcm


# Provide Code
# taking input from users

num1 = int(input("Enter first number:"))
num2 = int(input("Enter second number:"))

# Printing the result for the users
print("The LCM of", num1, "and",num2, "is", calculate_lcm(num1,num2)) # Function call with parameter

      
