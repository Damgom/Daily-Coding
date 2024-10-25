import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    flag = True
    for i in range(k):
        sys.stdin.readline() # dummy
        books = list(map(int, sys.stdin.readline().split()))

        if books != sorted(books, reverse=True):
            flag = False

    print("Yes" if flag else "No")

if __name__ == "__main__":
    main()