# Defining the function

def change_dic(dic1):
    dic1["year"] = 2021

    print("Dictionary inside function =", dic1)



# Driver Code

# Defining the dictionary

dic1 = {"Course":"Python Essentials", "Platform":"vityarthi"}

# calling the function

change_dic(dic1)

print("Dictionary outside function=",dic1)

'''

Call by Reference will work for all the data types except tuple, frozen set and string.
Because all the three are immutable.

'''
