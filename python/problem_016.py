import math

"""2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
"""

target = 1000

num = int(math.pow(2, target))

string = str(num)

total = 0

for i in string:
    total = total + int(i)

print(total)
