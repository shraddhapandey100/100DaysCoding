class OnlineStudent: # Class Namespace
    platform = "vityarthi"  # Class or Static Variable

    @staticmethod  # Static Method Decorator

    def add(m1,m2,m3):
        return (m1+m2+m3)


    @classmethod
    def avg(cls , m1,m2,m3):
        sum = cls.add(m1+m2+m3) # Method to call a static method

        return (sum/3)



# Driver Code

# Object Creation

m1, m2,m3 = map (int,input("Enter the marks for three subjects:").split())


average = OnlineStudent.avg(m1,m2,m3)
print("The Average mark of the student is=", average)
