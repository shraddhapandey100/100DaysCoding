# Euclid algorithm for calculation of greatest common divisor
a = int(input("Enter the first number->"))
b = int(input("Enter the second number->"))
def gcd(a,b):
    # base case
    if a==0:
        return b
    return gcd(b%a,a)
print("GCD of a and b is->",gcd(a,b))
# Extended Euclidean Algorithm
def gcdExtended(a,b,x,y):
    # Base Case
    if a==):
        x=0
        y=1
    return b
# Multiplication Inverse
def mult_inv(e,r):
    
   for x in range(1,r):
        if(((e%r)*(x%r))%r==1):
            return x
    return -1
print(mult_inv(e,r))
    
    
    
