'''
Description
The hypotenuse is the longest side of a right angled triangle. Using Pythagoras’s theorem, calculate the third side and also the area of the right triangle.

Input format: Enter two integers for width and height

Output format: The third of the triangle is:

Area of the right angled triangle is:

Sample Input: 

 

Enter width: 7

Enter height: 8

 

Sample Output: 

 

The third of the triangle is:10.63

Area of the right angled triangle is:28.0



'''
import math

Width= int(input("Enter width:"))

Height=int(input("Enter Height:"))

hypotenuse= math.sqrt(Width**2+Height**2)
print("The third of the triangle is:",round(hypotenuse,3))

Area= 0.5*(Width*Height)
print("Area of the right angled triangle is:",Area)



            
              



