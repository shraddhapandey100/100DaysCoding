'''
Description
Mr. Ashok Goel has spent ‘n’ units of effort in preparing for UPSC examination in a year. Can you calculate using a Python program how many hours, minutes and seconds he has spent on attaining success.

Input format : One integer

Output format :

Hours:

Minutes:

Seconds:

 

Sample Input: 45678

Sample Output: 

Hours: 12

Minutes: 41

Seconds: 18

'''



# Python Program to units of effort in preparing for UPSC examination.
# into hours, minutes and seconds.

def effort_calculation(seconds):
    seconds= seconds%(24*3600)
    hour= seconds//3600
    seconds = seconds%3600
    minutes = seconds//60
    seconds= seconds%60
    print("Hours:",hour)
    print("Minutes:",minutes)
    print("Seconds:",seconds)
 

# Driver Code

n= 45678
effort_calculation(n)
