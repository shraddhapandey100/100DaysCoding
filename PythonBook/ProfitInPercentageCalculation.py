'''
DescDecription
Profit calculation Using “Operators”

Mr. Rama buys a 2BHK luxury apartment in Bhopal  for the cost of Rs.A and he has gone for interior decorations with Rs.B cost. Luckily in his territory the government has announced a Special Economic Zone (SEZ). The demand for the flats in that area was boosted by the white collar & golden collar professionals. If he sells the flat for Rs.Z, what is his profit in percentage? Write a Python program to compute the profit in percentage? 

Input format : Three integers separated by space. Output format : The profit is:

Sample Input:   Enter cost, interior decoration, selling price: 1000000  10000 5000000

Sample Output: The profit is: 395.05



'''
 
# Enter the Enter_cost, interior_decoration, selling_price

Enter_cost, interior_decoration, selling_price= map(int, input(" Enter cost, interior decoration, selling price: ").split())

Total_Cost= Enter_cost+interior_decoration

Profit_Percentage= ((selling_price-Total_Cost)*100)/Total_Cost

# Print the Prfit in Percent

print("The profit is",round(Profit_Percentage,2))







