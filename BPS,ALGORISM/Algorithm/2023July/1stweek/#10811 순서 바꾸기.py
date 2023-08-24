#바구니 뒤집기(10811)
N,M=map(int, input().split()) # N,M 받기
my_list=[] #빈 리스트생성
for i in range (0,N):
    my_list.append(i+1) # 0~N번 인덱스 까지 입력
for i in range(M):
    i, j =map(int,input().split())
    start=i-1 #인덱스는 0부터 시작하니까 인덱스로 활용하기 위해서는 1을 빼줘야함
    end=j-1
    while (start<end): #바꾸는 조건(start와 end는 인덱스임(순서))
        temp=my_list[start] #temp로 my_list[start]값 넣기
        my_list[start]=my_list[end]
        my_list[end]=temp
        start+=1
        end-=1
for i in range(N):
    print(my_list[i],end=' ')

        

    



