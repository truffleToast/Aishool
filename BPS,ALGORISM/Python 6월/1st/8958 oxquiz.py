# def a(number):
#     answer = 0
#     for g in range(1, number+1):
#         answer += g
#     return answer
# N = int(input())  # 테스트 케이스 개수
# myList = []  # 빈 리스트 생성
# for i in range(N):  # 반복 횟수 N
#     test = input()  # O,X로 이루어진 문자열 입력
#     myList.append(test)  # 각 인덱스로 추가
# correct = 0  # 연속 맞은 개수 필드
# score = 0 #각 문자열의 점수를 초기화
# score_list = []  # 마지막 출력할 리스트
#
# for i in myList:
#     for j in i:
#         if j == 'O':
#             correct += 1
#         else:
#             score += a(correct)
#             correct = 0
#     score_list.append(score)
#     score = 0  # 점수 필드
#     correct = 0
# for A in score_list:
#     print(A)
#

N = int(input())
lst = []

for i in range(N):
    total = 0
    flag = 0
    my_str = input()
    for a in my_str:
        if a == 'O':
            flag += 1
            total += flag
        else:
            flag = 0
    print(total)