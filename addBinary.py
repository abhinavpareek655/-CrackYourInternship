class Solution:
    def addBinary(self, a: str, b: str) -> str:
        A = int(a,2)
        B = int(b,2)

        res = A + B
        return bin(res)[2:]
