'''
Description
Write a Python Program to Check if a Given Key Exists in a Dictionary or Not.

'''



Dict = {"A":1,"B":2, "C":3}

key = input("Enter the key:")
if key in Dict.keys():
    print("Key is present and value of the key is:")
    print(Dict[key])
else:
    print("Key isn't present!")
