class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> unique = new ArrayList<>();
        int longest = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (unique.contains(s.charAt(i))) {
                unique = unique.subList(unique.indexOf(s.charAt(i))+1, unique.size());
                unique.add(s.charAt(i));
                longest = unique.size();
            } else {
                unique.add(s.charAt(i));
                longest += 1;
                if (longest > max) {
                    max = longest;
                }
            }
        }

        return max;
    }
}