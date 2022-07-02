
'''
Description:

Python Program to remove the given key from a dictionary.



'''

# Dictionary
Dictionay= {"A":1 , "B":2 , "C":3, "D":4}


print("Initial Dictionary", Dictionary)

# Ask User to Enter the key that he/she want to delete

key = input("Enter the key that you want to delete:")

# Check the Condition

if key in Dictionary:
    del Dictionary[key]
else:
    print("Key Not found")
    exit(0)


# Print the Updated Dictionary

print("Updated Dictionary")
print(Dictionary)
