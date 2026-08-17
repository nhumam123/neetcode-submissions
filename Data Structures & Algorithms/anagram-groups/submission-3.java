class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = new String[] {};
        HashMap<String, List<String>> hashlist = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char[] currentArr = strs[i].toCharArray();
            Arrays.sort(currentArr);

            String key = String.valueOf(currentArr);

            if (!hashlist.containsKey(key)) {
                hashlist.put(key, new ArrayList());
            }

            hashlist.get(key).add(strs[i]);
        }
        return new ArrayList<>(hashlist.values());
    }
}
