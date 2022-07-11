# Function to convert decimal number
# to binary using recursion
def DecimalToBinary(num):
    if num>=1:
        DecimalToBinary(num//2)
    print(num%2,end="")

a=int(input("Enter the number Decimal number to convert it Binary"))
print(DecimalToBinary(a))
