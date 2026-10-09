class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int neededRights = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                if (neededRights % 2 != 0) {
                    insertions++;
                    neededRights--;
                }
                neededRights += 2;
            } else {
                neededRights--;
                if (neededRights < 0) {
                    insertions++;
                    neededRights += 2; 
                }
            }
        }
        
        return insertions + neededRights;
    }
}
