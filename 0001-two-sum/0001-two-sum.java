class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] toBeReturned = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    toBeReturned[0] = i;
                    toBeReturned[1] = j;
                    return toBeReturned;
                }
            }
        }

        return toBeReturned;
    }
}