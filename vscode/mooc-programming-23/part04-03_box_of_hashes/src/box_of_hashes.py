# Copy here code of line function from previous exercise
def line(width, character):
    print(character * width)


def box_of_hashes(height):
    count = 0
    while count < height:
        line(10, "#")
        count += 1


# You can test your function by calling it within the following block
if __name__ == "__main__":
    box_of_hashes(5)
