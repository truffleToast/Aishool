##평균 1546
N=int(input())
grade=list(map(float ,input("숫자를 입력하세요 , 단 공백으로 분류하고 마지막에는 엔터").split()))
maG=max(grade)
new_sum=(sum(grade)) *100/maG
answer=new_sum/len(grade)
print(answer)

N = int(input())
grade = list(map(float, input("숫자를 입력하세요, 단 공백으로 분류하고 마지막에는 엔터").split()))
maG = max(grade)
new_sum = (sum(grade) / maG) * 100
answer = new_sum / len(grade)
print(answer)