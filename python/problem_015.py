"""Starting in the top left corner of a 2×2 grid, and only being able to move to
the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
"""

def check_option(option):
    global total
    if (option[0] == target) and (option[1] == target):
        # print('total: ' + str(total))
        return True
    return False

def get_options(pos):
    options = []
    row = pos[0]
    column = pos[1]
    if (row <= target):
        options.append([row + 1, column])
    if (column <= target):
        options.append([row, column + 1])

    return options

def get_options_recursive(pos):    
    global total
    options = get_options(pos)
    for option in options:
        if check_option(option):
            total = total + 1
        else: 
            get_options_recursive(option)


target = 20

total = 0

get_options_recursive([0, 0])

print(total)
