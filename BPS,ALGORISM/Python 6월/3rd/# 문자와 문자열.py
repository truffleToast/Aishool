# 문자와 문자열
s, i=input('하나는 문자열 하나는 숫자로 입력하세요').split() # 입력받은 값을 공백으로 분리
num_i= int(i) # i값은 정수가아니라 문자로 인식되므로 integer화 하는 것이 필요
'''
 S를 문자열에서 리스트로 바꾸고
 인덱싱하여 출력하는 과정이 필요
'''
list_s=list(s)
print(list_s[num_i-1])