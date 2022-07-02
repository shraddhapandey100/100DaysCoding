# Addition of two numbers using instance method.


class Add_Class:
    def __init__(self, a, b):
        self.a=a
        self.b= b


        def instance_method(self):
            return (self.a+self.b)

print("Demo for the use of instance method")

x, y = map(int,input("Enter the numbers:").split())


obj= Add_Class(x,y) # Object Initialization

print("The Addition is", obj.instance_method()) # Method Call

