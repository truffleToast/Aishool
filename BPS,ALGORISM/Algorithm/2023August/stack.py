import sys # input에서 시간을 줄이기 위해 sys를 import
my_stack = []
answer = []
N = sys.stdin.readline().rstrip() # readline은 \n이 생략 되어 있으므로 공백제거
for i in range(int(N)):
    command = list(sys.stdin.readline().rstrip().split()) #입력할 값
    if command[0] == "push": # 바로 리스트로 만들어서 인덱스에 접근
        my_stack.append(command[1]) # 각 결과를 stack 또는 answer 에담아 문제 해결
    if command[0] == "top":
        if not my_stack:
            answer.append("-1")
        else:
            answer.append(my_stack[-1])
    if command[0] == "size":
        answer.append(len(my_stack))
    if command[0] == "pop":
        if not my_stack:
            answer.append("-1") # 정수를 입력하기 보다는 문자열로 처리, gpt추천
        else:
            answer.append(my_stack.pop())
    if command[0] == "empty":
        if not my_stack:
            answer.append("1")
        else:
            answer.append("0")
for ans in answer:
    print(ans)
