
a=float(input("Enter the value of a"))
b=float(input("Enter the value of b"))
c=float(input("Enter the value of c"))

print("Entered value is A", a)
print("Entered value is B", b)
print("Entered value is C", c)

if(a>=b and a>=c):
	print("A is greater")

if(b>=a and b>=c):
	print("B is greater")

if(c>=a and c>=b):
	print("C is greater")