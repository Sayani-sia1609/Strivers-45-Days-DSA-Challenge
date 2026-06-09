class Solution(object):
    def myPow(self, x, n):
        if n == 0:
            return 1.0
        elif n < 0:
            return 1 / self.myPow(x, -n)
        else:
            half_pow = self.myPow(x, n // 2)
            if n % 2 == 0:
                return half_pow * half_pow
            else:
                return x * half_pow * half_pow
        
