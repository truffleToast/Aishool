from collections import defaultdict
import sys
sys = sys.stdin.readline().split()  # sys 줄이기
lst = list(map(int, sys))  # list를 만들기
answer = defaultdict(int) # 빈 딕셔너리 만드는데 없는 값은 0 입력하면 바뀌는 딕셔너리
for num in lst:
    answer[num] += 1
# 많은 순서대로 밸류값을 수정해서 프린트하는방법?
