# Simple Class Demostration
class laptop:
    name= "Acers Predator Triton 300" # class Attribute or variable


# Driver Code

print("The Best on the go gamer's laptop:", laptop.name) # Accessing a class attribute using classname.attribute name



# Program to do complex number addition

class ComplexNumber:
    def __init__ (self ,r,i): # Constructor with self and other parameters

        self.real= r
        self.imag= i
    def get_data(self):
        print("The Complex Number :", self.real , "+", self.imag, "j")
    def add_data(self):
        print("The Addition is :", num1.real+num2.real, "+", num1.imag+num2.imag, "j")



# Driver Code

real , imag= map(int, input("Enter the real and imaginary parts:").split())
num1= ComplexNumber(real, imag)

real , imag= map(int, input("Enter the real and imaginary parts:").split())

num2 =ComplexNumber(real, imag)

# Call get_data() method & add_data()

num1.get_data()

num2.get_data()

num1.add_data()
num2.add_data()

