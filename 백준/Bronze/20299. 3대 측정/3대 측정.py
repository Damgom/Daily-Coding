import sys

N, K, L = map(int, sys.stdin.readline().split())
count = 0
result = []

for _ in range(N) :
    scores = list(map(int, sys.stdin.readline().split()))
    flag = True

    for i in scores :
        if i < L :
            flag = False
            break
    if flag :
        if sum(scores) >= K :
            result.extend(scores)
            count += 1

print(count)
print(*result)