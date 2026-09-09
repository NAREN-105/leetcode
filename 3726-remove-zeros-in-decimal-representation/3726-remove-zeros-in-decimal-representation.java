class Solution {
    public long removeZeros(long n) {
        String stripped = String.valueOf(n).replace("0", "");
        if (stripped.isEmpty() || stripped.equals("-")) {
        return 0;
        }
    return Long.parseLong(stripped);
    }
}