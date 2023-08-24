## 1차원배열
Number =int(input("숫자를 입력하세요: "))

my_list=[] #리스트로 풀기 위해 빈 리스트 생성
for i in range (1,Number+1): # 1부터 N까지 반복
    values= int(input())   #values를 설정한뒤
    my_list.append(values) # my_list에 append하여 추가

print(min(my_list), max(my_list))

