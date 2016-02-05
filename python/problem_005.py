"""2520 is the smallest number that can be divided by each of the numbers from 1
to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?
"""

def is_super_divisible(num):
    for i in range(20, 1, -1):
        if num % i:
            return False
    return True

found   = False
current = 1

while not found:
    current = current + 1
    if is_super_divisible(current):
        found = True

print(current)
