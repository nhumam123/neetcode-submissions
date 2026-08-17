class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        char[] schar = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!(schar[left] == schar[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
