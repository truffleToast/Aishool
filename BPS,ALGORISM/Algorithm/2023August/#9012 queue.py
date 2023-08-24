#9012 queue
# 큐는 선입 선출
import sys  # 더 빠른 접근을 위한 sys 사용
num = int(sys.stdin.readline().rstrip())
for i in range(num):
    my_queue = []
    word = sys.stdin.readline().rstrip()
    for g in word:
        if g == '(':  # 괄호를 여는 기호일 경우 큐에 넣는다.
            my_queue.append(g)
        else:
            if my_queue:  # my_queue가 존재할 경우
                my_queue.pop()  # 마지막에 있는 (를 지우기
            else:
                print('NO')
                break
    else:
        if(len(my_queue)) != 0:
            print('NO')
        else:
            print('YES')