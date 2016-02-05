import math

"""The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
"""

def is_prime(num):
    for i in range(2, math.ceil(math.sqrt(num))):
        if num % i is 0:
            return False

    return True

def get_prime_factors(num):
    factors = set([])

    for i in range(2, math.ceil(math.sqrt(num))):
        if num % i is 0 and is_prime(i):
            factors.add(i)
            print('prime factor: ' + str(i))

    return factors


num     = 600851475143
factors = get_prime_factors(num)
highest = max(factors)

print(highest)
