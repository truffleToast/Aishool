#합

# for문으로 풀기 sum 없이
n=int(input())
num=0
for i in range(1,n+1):
   num+=i
print(num)


#sum으로 풀기
m= int(input())
my_list=[]
for i in range(1,m+1):
    my_list.append(i)
print(sum(my_list))    

