#A+B
'''
0 < a, b < 10 이외의 값들이 들어온다면 멈추기

단, 이전에 값들은 **한줄로 출력**하기 

이외의 값이 **숫자나 문자** 둘다 해당됨.

'''

try:
    while True:
        A,B =map(int,input().split()) # a와 b에 숫자를 입력하세요,단 a는 0보다 커야하고 b는 10보다 작아야합니다
        if 0<A and B<10:
            answer= A+B
            print(answer)
        else :
            print("조건(0<a 또는 b<10)을 만족하지 않습니다.")
            break

except ValueError: #예외가 발생했을 때
  print("입력된 값에 오류가 있습니다.")
  pass

