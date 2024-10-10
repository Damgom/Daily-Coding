S = input()
K = input()

temp = ''
for s in S:
    if s.isalpha():
        temp += s

if K in temp:
    print(1)
else:
    print(0)

