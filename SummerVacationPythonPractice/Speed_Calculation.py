'''
Description
A car has travelled D kilometers in T hours of time. What is the speed of the car in km/hr? Write a python program to demonstrate.

Input format: Enter integers for distance and time

Output format: The speed of the car in Km/hr is:

Sample Input: 

56

4

 

Sample Output: 

14.0


'''


D,T= map(int,input("Enter integers for distance and time:").split())

speed= D/T

print("The speed of the car in Km/hr is:",speed)
