class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder yPart = new StringBuilder();
        StringBuilder xPart = new StringBuilder();
        StringBuilder otherPart = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == y) {
                yPart.append(ch);
            } else if (ch == x) {
                xPart.append(ch);
            } else {
                otherPart.append(ch);
            }
        }
        return yPart.append(otherPart).append(xPart).toString();
    }
}
