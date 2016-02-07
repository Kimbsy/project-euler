import csv

"""By starting at the top of the triangle below and moving to adjacent numbers on
the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle in

data/problem_018.csv:

NOTE: As there are only 16384 routes, it is possible to solve this problem by
trying every route. However, Problem 67, is the same challenge with a triangle
containing one-hundred rows; it cannot be solved by brute force, and requires a
clever method!
"""

data = []

with open('data/problem_018.csv') as input_file:
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