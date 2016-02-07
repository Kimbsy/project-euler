import csv

"""By starting at the top of the triangle below and moving to adjacent numbers
on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom in

data/problem067.py

a 15K text file containing a triangle with one-hundred rows.

NOTE: This is a much more difficult version of Problem 18. It is not possible to
try every route to solve this problem, as there are 2^99 altogether! If you
could check one trillion (10^12) routes every second it would take over twenty
billion years to check them all. There is an efficient algorithm to solve it.
"""

data = []

with open('data/problem_067.csv') as input_file:
    for row in csv.reader(input_file):
        int_row = [int(value) for value in row]
        data.append(int_row)

for i in range(len(data) - 1, 0, -1):
    row = data[i]
    for j in range(0, len(row) - 1):
        max_val = max([row[j], row[j + 1]])
        data[i - 1][j] = data[i - 1][j] + max_val
    row = data[i]

print(data[0][0])