editor = input("Editor:").lower()

while True:
    if editor == "visual studio code":
        print("an excellent choice!")
        break
    elif editor == "word" or editor == "notepad":
        print("awful")
    else:
        print("not good")
    editor = input("Editor:").lower()
