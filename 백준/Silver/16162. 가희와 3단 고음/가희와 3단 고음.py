N, A, D = map(int, input().split())
arr = list(map(int, input().split()))

count = 0
x = 0
for i in range(N):
    if arr[i] == A + (x * D):
        count += 1
        x += 1
print(count)