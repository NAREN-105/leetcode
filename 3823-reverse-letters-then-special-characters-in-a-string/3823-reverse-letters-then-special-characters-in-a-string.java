class Solution {
    public String reverseByType(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder special = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                special.append(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        int lIdx = letters.length() - 1; 
        int sIdx = special.length() - 1; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                res.append(letters.charAt(lIdx));
                lIdx--;
            } else {
                res.append(special.charAt(sIdx));
                sIdx--;
            }
        }
        
        return res.toString();
    }
}
