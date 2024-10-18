import sys

N, Q = map(int, sys.stdin.readline().split())
seq = list(map(int, sys.stdin.readline().split()))
seq.sort()

for i in range(1, N):
    seq[i] = seq[i-1] + seq[i]
for _ in range(Q):
    L, R = map(int, sys.stdin.readline().split())
    if L == 1:
        print(seq[R-1])
    else:
        print(seq[R-1] - seq[L-2])