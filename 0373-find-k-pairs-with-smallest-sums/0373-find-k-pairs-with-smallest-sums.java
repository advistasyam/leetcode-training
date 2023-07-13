class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair<List<Integer>,Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        List<List<Integer>> ans = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                if (pq.size() < k) {
                    pq.add(new Pair<>(new ArrayList<>(Arrays.asList(nums1[i],nums2[j])),sum));
                } else if (sum < pq.peek().getValue()) {
                    pq.poll();
                    pq.add(new Pair<>(new ArrayList<>(Arrays.asList(nums1[i],nums2[j])),sum));
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            Pair<List<Integer>,Integer> data = pq.poll();
            if (Objects.isNull(data)) {
                break;
            }

            ans.add(data.getKey());
        }

        return ans;
    }
}