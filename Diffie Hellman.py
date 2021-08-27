# Diffiee –Hellman principal
 
# Variables Use
sharedPrime = int(input("Enter the shraePrime number->"))# p=23
# check if input are prime number
def primecheck(sharedPrime):
    if(sharedPrime==2):
        return True;
    elif ((sharedPrime<2)or (sharedPrime%2==0)):
        return False
    elif (sharedPrime>2):
        for i in range(2,sharedPrime):
            if (sharedPrime%i==0):
                return False
            else:
                return True
    return True
check_prime = primecheck(sharedPrime)

print(check_prime)

while ( (check_prime==False)):
   sharedPrime= int(input("Please Enter the prime number(p)->"))
    
   check_prime = primecheck(sharedPrime)

# primitiveRoots
#To fing gcd of two numbers
def gcd(a,b):
    while b != 0:
        a, b = b, a % b
# primitiveRoots
def check_primRoots(sharedPrime):
    roots = []
    required_set = set(num for num in range (1,sharedPrime) if gcd(num, sharedPrime) == 1)

    for g in range(1, sharedPrime):
        actual_set = set(pow(g, powers) % sharedPrime for powers in range (1, sharedPrime))
        
        if required_set == actual_set:
            roots.append(g)           
    return roots
sharedPrime= int(input("Enter the same prime number for calculating the primitive roots"))
primitive_roots = check_primRoots(sharedPrime)
print(primitive_roots)

sharedBase = int(input("Enter the shareBase number by using the list of primitive roots that is given here->")) # g =5


aliceSecret = int(input("Enter the AliceSecret key->"))    # a=6
bobSecret = int(input("Enter the BobSecret key->"))     # b=15


 
# Begin
print( "Publicly Shared Variables:")
print( "    Publicly Shared Prime: " , sharedPrime )
print( "    Publicly Shared Base:  " , sharedBase )


 
# Alice Sends Bob A = g^a mod p
A = (sharedBase**aliceSecret) % sharedPrime
print( "\n  Alice Sends Over Public Chanel: " , A )


 
# Bob Sends Alice B = g^b mod p
B = (sharedBase ** bobSecret) % sharedPrime
print( " Bob Sends Over Public Chanel: ", B )
 
print( "\n------------\n" )
print( "Privately Calculated Shared Secret:" )


# Alice Computes Shared Secret: s = B^a mod p
aliceSharedSecret = (B ** aliceSecret) % sharedPrime
print("***********************************")
print( "    Alice Shared Secret: ", aliceSharedSecret )


 
# Bob Computes Shared Secret: s = A^b mod p
bobSharedSecret = (A**bobSecret) % sharedPrime
print("*****************************************")

print( "    Bob Shared Secret: ", bobSharedSecret )










