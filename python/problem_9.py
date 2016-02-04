import math

"""A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
"""

target = 1000

for i in range(1, target):
    for j in range(i, target):
        sum_of_squares = math.pow(i, 2) + math.pow(j, 2)
        k = math.sqrt(sum_of_squares)
        if i + j + k == target:
            print(int(i * j * k))
