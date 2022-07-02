# Getting Multiple Inputs with Spaces

# Profit Calculation

Enter_cost, interior_decoration, selling_price = map(int, input().split())

s= (Enter_cost+interior_decoration)/(Enter_cost-interior_decoration)

r= (selling_price- s)*100


Profit_Percentage= (r/selling_price)*100



print("The profit is:",round(r,3))

print("The profit is:",round(Profit_Percentage,3))


