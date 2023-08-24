from collections import defaultdict

N = int(input())  # 상근이의 숫자카드 개수
lst = list(map(int, input().split()))  # 상근이의 숫자카드 리스트

M = int(input())  # 상근이가 몇개 가지고 이는 숫자카드인가?
lst2 = list(map(int, input().split()))  # M 에서 입력한 만큼만 입력해야함

answer = defaultdict(int)  # 딕셔너리를 이용하여 개수를 저장
# defaultdict는 임포트 해서 사용 해야하고 설정하지않은 값은 0으로 자동 입력된다.
for num in lst:
    answer[num] += 1

for i in lst2:
    print(answer[i], end=' ')

