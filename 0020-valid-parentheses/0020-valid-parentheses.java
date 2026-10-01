import java.util.Stack;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
        char charAt = s.charAt(i);    
            if (bracketMap.containsKey(charAt)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMap.get(charAt)) {
                    return false;
                }
            } else {
                stack.push(charAt);
            }
        }
        return stack.isEmpty();
    }
}
