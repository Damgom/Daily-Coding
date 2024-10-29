N = int(input())
M = int(input())

s = [0 for i in range(N+1)]
for i in range(2,N+1):
    if s[i] == 0:
        for t in range(i,N+1,i):
            if t%i == 0:
                s[t] = max(s[t],i)
ans = 0
for i in s:
    if i <= M:
        ans += 1
print(ans-1)