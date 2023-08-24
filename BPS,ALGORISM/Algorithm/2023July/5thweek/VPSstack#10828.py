import sys
N = int(sys.stdin.readline().rstrip())
for i in range(N):
    stack = []
    gwalho = sys.stdin.readline().rstrip() #  for문안에서 문자열 입력받기
    for g in gwalho: # for each문으로 접근
        if g == "(":  # 만약 각 글자가 (라면 내 스택에 append
            stack.append(g)
        else:  # 그렇지 않다면 stack의 여부에 따라 달라짐
            if stack:
                stack.pop()
            else:
                print("NO")
                break
    else:
        if not stack:
            print("YES")
        else:
            print("NO")