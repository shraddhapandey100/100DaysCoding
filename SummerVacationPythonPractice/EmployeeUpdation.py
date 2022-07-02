'''

Description
A startup company named ‘MY_Chat’ having four employees names as Sunny, Ravi, Vijay and Messi having the respected salaries are 25000,23000, 26000, and 30000.

After six months, Sunny resigned from his job. Update data based on employee name.

Input format: Sunny

Output format: all employee data after update



'''

MY_Chat= {
    "Sunny":25000,
    
    "Ravi":23000,
    "Vijay":26000,
    "Messi":30000

}

print(MY_Chat)


# After 6 Month

del MY_Chat["Sunny"]

# Print the Updated Records

print("all employee data after update:",MY_Chat)



