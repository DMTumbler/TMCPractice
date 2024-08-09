def line(width, character):
    print(character * width)


def shape(size, character, height, char):
    count = 0
    count1 = 0
    while count <= size:
        line(count, character)
        count += 1

    while count1 < height:
        line(size, char)
        count1 += 1


if __name__ == "__main__":
    shape(5, "x", 2, "o")
