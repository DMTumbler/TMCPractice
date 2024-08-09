def spruce(width):
    count = 0
    print("a spruce!")

    while count < width:
        spaces = " " * (width - count - 1)
        stars = "*" * (2 * count + 1)
        print(f"{spaces}{stars}")
        count += 1

    count = 0
    spaces = " " * (width - count - 1)
    stars = "*" * (2 * count + 1)
    print(f"{spaces}{stars}")


# You can test your function by calling it within the following block
if __name__ == "__main__":
    spruce(5)
