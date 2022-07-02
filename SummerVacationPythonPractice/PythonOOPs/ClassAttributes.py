class Item:
    def __init__(self, name:str,price:float, quantity=0):
        # Run validations to the received arguments

        assert price>= 0, f"Price {price}is not greater than or equal to zero!"
        assert quantity>= 0, f"Quantity {quantity}is not greater than or equal to zero!"


        # Assign to self object

        self.name= name
        self.price = price
        self.quantity= quantity

        # Action to execute
        Item.all.append(self)



    def calculate_total_price(self):
        return self.price*self.quantity

    def apply_discount(self):
        self.price = self.price*self.pay_rate

    def __repr__(self):
        return f"Item('{self.name},{self.price}, {self.quantity})"


item1 = Item("Phone", 100, 1)
item2 = Item("Laptop", 1000, 2)


print(item1.calculate_total_price())

print(item2.calculate_total_price())

print(Item.all)
