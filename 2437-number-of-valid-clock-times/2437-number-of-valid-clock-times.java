class Solution {
    public int countTime(String time) {
        int hoursPossibilities = 1;
        int minutesPossibilities = 1;
        char h1 = time.charAt(0);
        char h2 = time.charAt(1);

        if (h1 == '?' && h2 == '?') {
            hoursPossibilities = 24;
        } else if (h1 == '?') {
            hoursPossibilities = (h2 - '0' < 4) ? 3 : 2;
        } else if (h2 == '?') {
            hoursPossibilities = (h1 == '2') ? 4 : 10;
        }
        char m1 = time.charAt(3);
        char m2 = time.charAt(4);
        if (m1 == '?') {
            minutesPossibilities *= 6;
        }
        if (m2 == '?') {
            minutesPossibilities *= 10;
        }
        return hoursPossibilities * minutesPossibilities;
    }
}
