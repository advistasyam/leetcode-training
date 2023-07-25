class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];
        int lowestFrequency = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            pq.add(new Pair<>(x.getKey(), x.getValue()));
        }
        for (int i = 0; i < k; i++) {
            answer[i] = pq.poll().getKey();
        }
        return answer;
    }
}