class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        boolean isSameLength = s.length() == t.length();

        if (Arrays.equals(sChar, tChar) && isSameLength) return true;
        return false;

        

    }


    
}
