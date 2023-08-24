#5086 배수와 약수
my_list=[]
while True:
   a=list(map(int,input().split())) #split으로 받고 list화 해서 a를 설정
   if a!=[0,0]: # 받은 리스트가 0,0이아니면
       if(a[0]>a[1]): #리스트 인덱스 0과 리스트 인덱스 1을 비교하여 0이 크면
           c=a[0]%a[1]  # c는 인덱스 0에서 인덱스 1을 나눈 나머지
           if(c==0): #만약 c가 그렇게 햇을때 0이라면
               my_list.append("multiple") #c는 a의 약수이다.
           else:
               my_list.append("neither") #c는
       else:
           c=a[1]%a[0]
           if(c==0):
              my_list.append("factor")
           else:
               my_list.append("neither")
   else:
       break
for i in range(len(my_list)):
    print(my_list[i])