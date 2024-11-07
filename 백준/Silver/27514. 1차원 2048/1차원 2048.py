import math

n = int(input())
num = list(map(int, input().split()))
p_num = [0 for _ in range(63)]
for i in num:
    if i:
        p_num[int(math.log2(i))] += 1
for i in range(62):
    p_num[i + 1] += p_num[i] // 2
for i in range(62, -1, -1):
    if p_num[i]:
        print(2 ** i)
        break