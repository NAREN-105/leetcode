import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
    
        Map<String, String> lookup = new HashMap<>();
        for (List<String> pair : knowledge) {
            lookup.put(pair.get(0), pair.get(1));
        }
        
        StringBuilder result = new StringBuilder();
        StringBuilder currentKey = new StringBuilder();
        boolean inBracket = false;
        
       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                inBracket = true;
            } else if (ch == ')') {
                inBracket = false;
                String key = currentKey.toString();
                
                
                result.append(lookup.getOrDefault(key, "?"));
                
                
                currentKey.setLength(0);
            } else {
                if (inBracket) {
                    currentKey.append(ch);
                } else {
                    result.append(ch);
                }
            }
        }
        
        return result.toString();
    }
}
