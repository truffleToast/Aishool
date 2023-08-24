my_list=[] #리스트로 풀기 위해 생성
for i in range(9):
    num=int(input())
    my_list.append(num)
print(max(my_list)) # 최대값
b=max(my_list)
print(my_list.index(max(my_list)+1)) # 최대값 인덱스 +1


