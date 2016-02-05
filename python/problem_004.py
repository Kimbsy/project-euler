import math

"""A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
"""

def is_palindrome(num):
    string = str(num);
    for i in range(0, math.floor(len(string) / 2)):
        if string[i] is not string[-(i+1)]:
            return False
    return True


palindromes = set([])

for i in range(100, 1000):
    for j in range(100, 1000):
        if is_palindrome(i * j):
            palindromes.add(i * j)

print(max(palindromes))
