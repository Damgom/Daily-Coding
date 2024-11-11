import sys

str = sys.stdin.readline()

str = str.replace("pi", " ")
str = str.replace("ka", " ")
str = str.replace("chu", " ")

if len(str.strip()) == 0:
    print("YES")
else:
    print("NO")
