# Python program to demostrate

# Method Overriding

class Parent: # Defining a parent class.
    # Constructor
    def __init__(self):
        self.value= "I am from Parent Class"
        # Parent's Display Class.

    def display(self):
        print(self.value)



class Child(Parent): # Defining a child class.
    # Constructor
    def __init__(self):
        self.value = "I am from Child Class"

        # Child's display method

    def display(self):
        print(self.value)


# Driver Code

obj1= Parent()# Object for the Parent class

obj2= Child() # Object for the child Class


obj1.display()# Method Call to Parent Class
obj2.display() # Method Call to child class
    
    
