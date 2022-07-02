# Python Program to find GCD of two numbers

# Define a Function

def compute_gcd(num1,num2):
    # Choose the smaller number
    if num1>num2:
        smaller = num2

    else:
        smaller = num1

    for i in range(1, smaller):
        if((num1%i==0) and (num2%i==0)):
            gcd = i
    return gcd



# Drive Code

num1= int(input("Enter Second number1:"))

num2= int(input("Enter Second number2:"))

print("The GCD is: ", compute_gcd(num1,num2))
print("The GCD is: ", compute_gcd(num2,num1))



