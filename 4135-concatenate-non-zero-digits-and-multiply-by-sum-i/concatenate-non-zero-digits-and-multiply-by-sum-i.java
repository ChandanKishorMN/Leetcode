class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);

        long concat = 0;
        long sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            if (digit != 0) {
                concat = concat * 10 + digit;
                sum += digit;
            }
        }

        return concat * sum;
    }
}