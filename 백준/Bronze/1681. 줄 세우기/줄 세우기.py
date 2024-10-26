N, L = map(int, input().split())
num = 1
for _ in range(N):
    while str(L) in str(num):
        num += 1
    num += 1
print(num - 1)