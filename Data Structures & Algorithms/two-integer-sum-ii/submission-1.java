class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currsum = numbers[left] + numbers[right];
            if ( currsum > target) right--;
            else if (currsum == target) {
                return new int[]{++left,++right};
            }
            else left++;
        }

        return new int[]{0,0};
    }
}
