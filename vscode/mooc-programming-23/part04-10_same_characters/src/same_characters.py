# Write your solution here
def same_chars(string, index1, index2):
    while index2 < len(string):
        if string[index1] == string[index2]:
            return True
    return False


# You can test your function by calling it within the following block
if __name__ == "__main__":
    print(same_chars("racecar", 0, 6))
