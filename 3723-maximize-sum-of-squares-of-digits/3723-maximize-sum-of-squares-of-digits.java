class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9L * num) {
            return "";
        }
        int nines = sum / 9;
        int remainder = sum % 9;
        StringBuilder sb = new StringBuilder(num);
        sb.append("9".repeat(nines));
        if (remainder > 0) {
            sb.append(remainder);
        }
        int zerosNeeded = num - sb.length();
        if (zerosNeeded > 0) {
            sb.append("0".repeat(zerosNeeded));
        }
        return sb.toString();
    }
}