# import sys
# N = int(input())  # 상근이의 숫자카드 개수
# lst = list(map(int, sys.stdin.readline().split()))  # 상근이의 숫자카드 리스트
# M = int(input())  # 상근이가 몇개 가지고 이는 숫자카드인가?
# lst2 = list(map(int, sys.stdin.readline().split()))  # M 에서 입력한 만큼만 입력해야함
# answer = list()  # 정답을 출력하기 위한 빈 리스트 만들기
# for i in range(len(lst2)):
#     a = lst.count(lst2[i]) #append 하기위해 변수 설정
#     answer.append(a) #answer에 append한 값을 표기
# print(*answer)

# 시간초과 == 리스트로 풀면 안됨, dictionary활용 
## chatGPT로 변환해서 풀엇음
from collections import defaultdict

N = int(input())  # 상근이의 숫자카드 개수
lst = list(map(int, input().split()))  # 상근이의 숫자카드 리스트

M = int(input())  # 상근이가 몇개 가지고 이는 숫자카드인가?
lst2 = list(map(int, input().split()))  # M 에서 입력한 만큼만 입력해야함

answer = defaultdict(int)  # 딕셔너리를 이용하여 개수를 저장
print(answer)
# defaultdict는 임포트 해서 사용 해야하고 설정하지않은 값은 0으로 자동 입력된다.
for num in lst:  # lst, 상근이의 원래 숫자리스트에 있는 값을 찾아서 answer에 하나하나 더해줌
    answer[num] += 1
for i in lst2:  #  lst2에 있는 값을 프린트 하는데 answer[i]의 키값을 프린트 없다면 0이 출력되고 있다면 숫자가 출력됨
    print(answer[i], end=' ')




