class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        minLength = sys.maxsize
        for s in strs:
            minLength = min(minLength, len(s))
        for i in range(minLength):
            let = strs[0][i]
            for s in strs:
                if s[i] != let:
                    return res
            res += let
        return res
