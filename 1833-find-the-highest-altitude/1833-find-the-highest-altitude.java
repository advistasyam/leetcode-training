class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int temp = 0;
        for (int i = 0; i < gain.length; i++) {
            temp = temp + gain[i];
            highest = Math.max(temp, highest);
        }

        return highest;
    }
}