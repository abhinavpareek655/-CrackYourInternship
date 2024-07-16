class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        redCount = 0
        whiteCount = 0
        blueCount = 0
        for num in nums:
            if num==0:
                redCount+=1
            elif num==1:
                whiteCount+=1
            else:
                blueCount+=1
        i=0
        while i<redCount:
            nums[i]=0
            i+=1
        while i<redCount+whiteCount:
            nums[i]=1
            i+=1
        while i<redCount+whiteCount+blueCount:
            nums[i]=2
            i+=1
        
