import math

"""By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
that the 6th prime is 13.

What is the 10 001st prime number?
"""

def is_prime(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i is 0:
            return False
    return True


num = 2
count = 1
max_count = 10001
while count < max_count:
    num = num + 1
    if is_prime(num):
        count = count + 1

print(num)
