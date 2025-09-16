class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;

        // Handle sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Call recursive helper
        return helper(s, i, sign, 0);
    }

    private int helper(String s, int i, int sign, long result) {
        // Base case: end or non-digit
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * result);
        }

        // Add current digit
        result = result * 10 + (s.charAt(i) - '0');

        // Overflow check
        if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        // Recursive call for next character
        return helper(s, i + 1, sign, result);
    }
}
