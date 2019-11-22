import math

a=float(input("Enter the value of a"))
b=float(input("Enter the value of b"))
c=float(input("Enter the value of c"))

D=(b*b-4*a*c)

print("The values of D is",D)
if(D<0):
	print("Roots are Imaginary")
elif(D==0):
	x1=(-b+math.sqrt(D))//2*a
	print("Roots are real and equals",x1)
elif(D>0):
	x1=(-b+math.sqrt(D))//2*a
	x2=(-b-math.sqrt(D))//2*a
	print("The value of x1 ",x1)
	print("The value of x2 ",x2)