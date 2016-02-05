import math

"""The sum of the squares of the first ten natural numbers is:

1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is:

(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural
numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum.
"""

def sum_of_squares(num):
    total = 0
    for i in range(1, num + 1):
        total = total + math.pow(i, 2)
    return total

def square_of_sums(num):
    total = 0
    for i in range(1, num + 1):
        total += i
    return math.pow(total, 2)

num = 100
difference = int(math.fabs(sum_of_squares(num) - square_of_sums(num)))
print(difference)
