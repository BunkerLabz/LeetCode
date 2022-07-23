from sortedcontainers import SortedList

class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        ans = []
        sl = SortedList()
        
        for x in reversed(nums):
            index = sl.bisect_left(x)
            ans.append(index)
            sl.add(x)
            
        return ans[::-1]
        