class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] boolNum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1 && nums[i] <= nums.length) {
                boolNum[nums[i]-1] = 1;
            }
        }

        for (int i = 0; i < boolNum.length; i++) {
            if (boolNum[i] == 0) {
                return i+1;
            }
        }

        return nums.length+1;
    }
}