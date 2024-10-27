import sys

def main():
    N = int(sys.stdin.readline())
    count = list(map(int, sys.stdin.readline().split()))

    result = -1
    for i in range(N+1):
        true_count = count.count(i)
        if true_count == i:
            result = max(true_count, i)

    print(result)

if __name__ == "__main__":
    main()