# Copy here code of line function from previous exercise
def line(width, character):
    print(character * width)


def triangle(size):
    count = 0
    while count <= size:
        line(count, "#")
        count += 1


# You can test your function by calling it within the following block
if __name__ == "__main__":
    triangle(5)
