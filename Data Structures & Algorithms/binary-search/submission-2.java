class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = l + r / 2;
        while (l <= r) {
            if(target == nums[m]) {
                return m;
            } else if (target < nums[m]) {
                r = m - 1;
            } else if (target > nums[m]){
                l = m + 1;
            }
            m = l + ( r - l) / 2;
        }
        return -1;
    }
}
