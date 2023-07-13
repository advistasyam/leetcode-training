class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int indexNeedle = 0;
            int j = i;
            while (true) {
                if (indexNeedle == needle.length()) {
                    return i;
                }

                if (j >= haystack.length()) {
                    break;
                }

                if (haystack.charAt(j) == needle.charAt(indexNeedle)) {
                    indexNeedle++;
                    j++;
                } else {
                    break;
                }
            }
        }

        return -1;
    }
}