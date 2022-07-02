# Import the statistics Module 
import statistics

# Ask to User to How many number they want to make a List.
Mean_values= int(input("How many Number you want to enter?"))
lst= []

# Fill the list Number inputed by the User.
print("Enter {} the value:".format(Mean_values))
for i in range(Mean_values):
    Values= int(input("Enter the value:"))
    lst.append(Values)

print("List is:",lst)

x=lst.copy()

# Calculate the Mean
Mean= statistics.mean(x)

# Calculate the Standard Deviation

Standard_Deviation= statistics.stdev(x)

# Print the Mean and Standard Deviation

print("Mean is:",Mean)
print("Standard Deviation is:", Standard_Deviation)


