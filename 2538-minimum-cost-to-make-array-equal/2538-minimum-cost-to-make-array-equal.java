class Solution {
    public long minCost(int[] nums, int[] cost) {
        // Declare the maxSize variable to
        // store max upper number
        int maxSize = 1000000;

        long[] total_cost_at_i = new long[maxSize];

        // Add the cost of all
        // similar elements
        for (int i = 0; i < nums.length; i++) {
            total_cost_at_i[nums[i]] += cost[i];
        }

        // Declare the prefix and suffix arrays
        long[] prefix = new long[maxSize];
        long[] suffix = new long[maxSize];

        // Store the cost to convert all the
        // elements before i to i
        long sum = 0;
        for (int i = 1; i < maxSize; i++) {
            prefix[i] = prefix[i - 1] + sum;
            sum = sum + total_cost_at_i[i];
        }

        // Store the cost to convert all the
        // elements after i + 1 to i
        sum = 0;
        for (int i = maxSize - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + sum;
            sum = sum + total_cost_at_i[i];
        }

        // Store the minimum cost in the
        // min_cost variable.
        long min_cost = Long.MAX_VALUE;
        for (int i = 0; i < maxSize; i++) {
            min_cost = Math.min(min_cost, (prefix[i] + suffix[i]));
        }

        return min_cost;
    }
}