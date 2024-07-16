class Solution:

    def findMinDiff(self, A,N,M):
        A.sort();
        res = A[len(A)-1]-A[0]
        for i in range(0,N-M+1):
            res = min(res,A[M+i-1]-A[i])
        return res
