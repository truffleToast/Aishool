## 문자열반복

# S=input("문자열 입력:")
# R=int(input(" 숫자를 입력해주세요"))
s, r=input("문자열을 입력하되 띄어쓰기 후에는 숫자를 입력하세요").split()
R=int(r)

 # 문자가 s 안에 있다면
 # 문자를 R번 곱해서 반복해라.
for char in s:
    char = char*R

    print(s)    