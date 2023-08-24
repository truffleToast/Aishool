#평균
n= int(input())
grades=list(map(int,input().split()))
mxg=max(grades) # 최대값
for i in range(len(grades)): #for문으로 해서 각각 인덱스에 대응
    grades[i] = grades[i]/mxg*100 
new_mean=sum(grades)/len(grades) # for문 연산 후에 새로운 평균을 구함
print(new_mean)     