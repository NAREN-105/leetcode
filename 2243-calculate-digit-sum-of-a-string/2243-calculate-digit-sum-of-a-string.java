class Solution {
    public String digitSum(String s, int k) {
       
        while (s.length() > k) {
            StringBuilder nextRoundString = new StringBuilder();
            
           
            for (int i = 0; i < s.length(); i += k) {

                int end = Math.min(i + k, s.length());
                String group = s.substring(i, end);
                
              
                int groupSum = 0;
                for (int j = 0; j < group.length(); j++) {
                    groupSum += group.charAt(j) - '0'; 
                }
                
                
                nextRoundString.append(groupSum);
            }
            
            
            s = nextRoundString.toString();
        }
        
        return s;
    }
}
