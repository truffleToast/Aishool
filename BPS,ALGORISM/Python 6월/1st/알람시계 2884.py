# 알람시계 2884
H, M = map(int, input().split())
M -= 45
if M < 0:
    M += 60
    H -= 1
    if H < 0:
        H = 23
print(H, M)












