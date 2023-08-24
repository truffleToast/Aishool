# 3052 나머지
my_list=[] #빈 리스트 만들기
for i in range (10):
    N=int(input())% 42 # 한줄에 하나씩 받아서 바로 나머지화
    my_list.append(N)
cnt=0 # 갯수를 세기 위한 변수
for i in range(10):
    for j in range(10):
        if i<j:
            if (my_list[i]==my_list[j]):
                cnt+=1
                break
print(10-cnt)




        


