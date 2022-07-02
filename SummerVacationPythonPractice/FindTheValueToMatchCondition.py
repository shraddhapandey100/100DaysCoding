'''


Description
On what input of a and b this program will display “I win the game”? Find the value of a and b. 

if (a & b >= 1) | (a^b <=1) :

    print(“I win the game”)

else:

    print(“I lose the game”)
'''



a= int(input()) # 1 , 2
b=int(input()) # 1, 3


if (a & b >= 1) | (a^b <=1) :

    print("I win the game")

else:

    print("I lose the game")



# Answer:


# If we enter the value of a=2 and b= 3 then the result will be "I win the game"
# So the expected value are 2 and 3.
