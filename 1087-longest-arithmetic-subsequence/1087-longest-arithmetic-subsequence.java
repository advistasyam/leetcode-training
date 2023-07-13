class Solution {
    public int longestArithSeqLength(int[] nums) {
        // Stores the length of sequences
        // having same difference
        int n = nums.length;
        Map<Integer,
        Map<Integer,
            Integer>> dp = new HashMap<Integer,
                                Map<Integer,
                                    Integer>>();
    
        // Stores the resultant length
        int res = 2;
    
        // Iterate over the array
        for(int i = 0; i < n; ++i)
        {
            for(int j = i + 1; j < n; ++j)
            {
                int d = nums[j] - nums[i];
                Map<Integer, Integer> temp;
    
                // Update length of subsequence
                if (dp.containsKey(d))
                {
                    temp = dp.get(d);
    
                    if (temp.containsKey(i))
                        temp.put(j, temp.get(i) + 1);
                    else
                        temp.put(j, 2);
                }
                else
                {
                    temp = new HashMap<Integer, Integer>();
                    temp.put(j, 2);
                }
                dp.put(d, temp);
                res = Math.max(res, temp.get(j));
            }
        }
        
        // Return res
        return res;
    }
}