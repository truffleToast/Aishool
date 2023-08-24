#약수 구하기(2501)
## http://www.acmicpc.net/problem/2501
N, K =map(int, input().split())
cnt=0
my_list=[]
for i in range (1,N+1):
    if(N%i==0):
        my_list.append(i)
if(len(my_list)<K):
    print(0)
else:
    print(my_list[K-1])