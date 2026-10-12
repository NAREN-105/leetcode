class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        String[] mapping = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digitIndex = Character.getNumericValue(digits.charAt(i));
            String letters = mapping[digitIndex];
            while (result.peek().length() == i) {
                String partialCombination = result.remove(); 
                
                
                for (char letter : letters.toCharArray()) {
                    result.add(partialCombination + letter); 
                }
            }
        }

        return result;
    }
}
