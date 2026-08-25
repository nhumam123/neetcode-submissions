class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hashmapIndex = new HashMap<>();
        int maxLength = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);

            // lompat jika ada
            if (hashmapIndex.containsKey(currentChar) && hashmapIndex.get(currentChar) >= l) {
                l = hashmapIndex.get(currentChar) + 1;
            }
            hashmapIndex.put(currentChar, r);
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
