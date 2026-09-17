class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxFreqInWindow = 0
        count = {}
        left = 0
        right = 0
        result = 0
        for right in range(len(s)):
            count[s[right]] = count.get(s[right],0) + 1
            maxFreqInWindow = max(maxFreqInWindow, count[s[right]])

            if right-left+1 - maxFreqInWindow > k:
                count[s[left]] -= 1
                left+=1
            result = max(result,right-left+1)

        return result
        