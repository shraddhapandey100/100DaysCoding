'''
Description
On what input of a and b this program will display “I win the game”? Find the value of a and b. And explain the logic of this program (Note: The order of evaluation and precedence of expression evaluation) . 

if (a & b >= 1) | (a^b <=1) :

    print(“I win the game”)

else:

    print(“I lose the game”)


'''

a = int (input())
b= int(input())
if (a & b >= 1) | (a^b <=1) :

    print("I win the game")

else:

    print("I lose the game")


# Description :

# According to the PEMDAS  rule first parentheses will be solved so both part
# ( a & b >= 1) and (a^b <=1) then (a & b >= 1) | (a^b <=1) will be solved.

# If resultant value will be true then it will print that "I win the game" otherwise
# will be printing "I lose the game".






