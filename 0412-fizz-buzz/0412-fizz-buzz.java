class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arrStr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arrStr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arrStr.add("Fizz");
            } else if (i % 5 == 0) {
                arrStr.add("Buzz");
            } else {
                arrStr.add(Integer.toString(i));
            }
        }
        return arrStr;
    }
}