
def sum(n):
    if n>1:
        return n + sum(n-1)
    return 1

num = int(input("Enter the number"))

print("The Sum is : ", sum(num))
