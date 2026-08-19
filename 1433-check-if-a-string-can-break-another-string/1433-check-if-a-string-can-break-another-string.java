public class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        
       
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        boolean s1BreaksS2 = true;
        boolean s2BreaksS1 = true;
        
        
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] < chars2[i]) {
                s1BreaksS2 = false;
            }
            if (chars2[i] < chars1[i]) {
                s2BreaksS1 = false;
            }
            
           
            if (!s1BreaksS2 && !s2BreaksS1) {
                return false;
            }
        }
        
        return true;
    }
}
