# Write a program to convert days into months and days.
inputDays = int(input("Enter the no. of days"))
print(inputDays)

years = inputDays//365
month= inputDays//30

days=inputDays-(month*30)


#print("The number of years is ",years)
print("The number of months is ",month)
print("The number of days is ",days)