#Write a program to find sum of all integers greater than 100 & less than 200 and are divisible by 5.

result = 0;

for i in range(100,200):
	if((i%5)==0):
		result+=i
		#print(result)
print(result)