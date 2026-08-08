class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        
        int[] last = new int[m];
        int r = n - 1;
        
       
        for (int j = m - 1; j >= 0; j--) {
            while (r >= 0 && word1.charAt(r) != word2.charAt(j)) {
                r--;
            }
            if (r >= 0) {
                last[j] = r;
                r--; 
            } else {
                last[j] = -1;
            }
        }
        
        int[] result = new int[m];
        int j = 0; 
        boolean changed = false; 
        

        for (int i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                result[j] = i;
                j++;
            } else if (!changed) {
                
                if (j + 1 == m || (last[j + 1] > i)) {
                    result[j] = i; 
                    j++;
                    changed = true; 
                }
            }
        }
        
       
        return j == m ? result : new int[0];
    }
}
