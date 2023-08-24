# 10798 vertical read
yeongsuk = []
length=[]
yeongsukread=[]
for i in range(5):
    word=input()
    yeongsuk.append(word)
    length.append(len(word))
# 이러면 5개의 문자로된 리스트가 만들어진다.
##yeongsuk==[[1,2,3,4,5],[2,3,4,5,6],[3,a,s,c,cf,g,h,ewr,e],[3,123,125,6,7,8,3],[asdf,d,sadg,b,b,sag,3,124,5,6]]
verticalword = ''
for i in range(max(length)):
    for j in range(5):
        if i < length[j] :
            verticalword += yeongsuk[j][i]

print(verticalword)


