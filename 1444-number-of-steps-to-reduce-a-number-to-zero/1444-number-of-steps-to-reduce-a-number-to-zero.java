class Solution {
    public int numberOfSteps(int num) {
        int total = 0;
        while (num != 0) {
            total++;
            if (num % 2 == 0) {
                num  = num / 2;
            } else {
                num -= 1;
            }
        }

        return total;
    }
}