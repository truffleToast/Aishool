### palindrome
class Solution:
    def isPalindrome(self, x: int) -> bool:
      '''
      x:int  
      type:bool

      '''
      if x<0: ## x가 0보다 작다면 False를 리턴해라
         return False
      
      str_x=str(x) # 그렇지 않다면 x값을 문자화 하여 거꾸로 한다는 데 잘모르겟네요
      return str_x == str_x[::-1]