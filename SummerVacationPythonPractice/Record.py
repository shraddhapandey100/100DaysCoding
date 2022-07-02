'''
Description
School attendance register needs to be prepared with several columns. Amongst ‘Name’ column size need to be decided based on the longest word in the list of students’ names.

The program takes a list of words and returns the word with the longest length. If there are two or more words of the same length then the first one is considered.

 
2
Input format : One integer (Number of Words) followed by list words separated by newline or enter

Output format : The word with the longest length is:


'''




print("-------- Program for Student Information--------")

D= dict()

N= int(input("How many student record you want to store??"))

# Add Student information to the List


lst = []

for i in range(0,N):
    # Take combined input name and percentage and split function using split function

    x,y = input("Enter the student name and it's percentage:").split()
    # Add name and marks stored in x, y respectively using tuple to the list
    
    lst.append((y,x))

# Sort the elements of list based on marks

lst = sorted (lst,reverse = True)


print("Sorted list of students according to their name word length in decending order")

for i in lst:
    # Print name and stored in second and first position respectively in list of tuples.
     print(i[1],i[0])

# Print name and stored in second and first position respectively in list of tuples.     


print("The word with the longest length is:",i[1],i[0])

   
    

