'''
Description
Asha has a huge collection of country currencies. She decided to count the total number of distinct country currencies in her collection. She asked for your help. You pick the currency one by one from a stack of country currencies.

Find the total number of distinct country currencies.

 

Input Format:

 

The first line contains an integer N , the total number of country currencies.

The next N lines contains the name of the country where the currency is from

 

Sample Input and Output

Enter Number of Currencies 3

Enter the name of the country India

1

Enter the name of the country USA

2

Enter the name of the country Japan

3

 

'''




Stack = ["India", "Japan","USA","India", "Japan","USA","India", "Japan","USA","India", "Japan","USA","Malyalam"]

N= int(input("Enter Number of Currencies:"))
for i in range(N):
       Contry_Calculation= input("Enter the name of the country")

       # check the condition
       
       if Contry_Calculation in Stack:
           print(Stack.count(Contry_Calculation))
       else:
            print("Contry is not present in the Stack")


       
