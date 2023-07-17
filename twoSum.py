class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sol=[]
        for i in range(len(nums)):
            value=target-nums[i]
            if value in nums and i!=nums.index(value):
                index=nums.index(value)
                sol.append(i)
                sol.append(index)
                return sol
        