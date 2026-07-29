class Solution {
    public String reverseWords(String s) {
        s = s.trim().strip();
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int t = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equals("")||words[i].isEmpty()|| i == 0) {
             sb.append(words[i]);
            }
            
            else
            {
                sb.append(words[i] + " ");
            }
        }
        return sb.toString();
    }
}