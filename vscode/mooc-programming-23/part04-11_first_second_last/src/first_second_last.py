# Write your solution here
def first_word(sentence: str) -> str:
    index = sentence.find(" ")
    return sentence[0:index]


def second_word(sentence: str) -> str:
    start = sentence.find(" ")
    sentence = sentence[start + 1 :]
    if " " in sentence:
        return sentence[: sentence.find(" ")]
    else:
        return sentence


def last_word(sentence: str) -> str:
    index = sentence.rfind(" ")
    return sentence[index + 1 :]


# You can test your function by calling it within the following block
if __name__ == "__main__":
    sentence: str = "once upon a time there was a programmer"
    print(first_word(sentence))
    print(second_word("first second"))
    print(last_word(sentence))
