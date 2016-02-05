import math

"""The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
"""

def is_prime(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i is 0:
            return False
    return True


target = 2000000
total = 2

for i in range(3, target, 2):
    if is_prime(i):
        total = total + i

print(total)
