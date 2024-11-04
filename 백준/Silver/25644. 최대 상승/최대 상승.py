import sys

N = int(sys.stdin.readline())
ANA = list(map(int, sys.stdin.readline().split()))
benefit, result = 0, 0

for i in range(N-1, -1, -1):
    benefit = max(benefit, ANA[i])
    result = max(result, benefit - ANA[i])

print(result)
