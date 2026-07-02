class Solution {
    public static String  count(String s)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            sb.append(count).append(currentChar);
            i++;
        }
        return sb.toString();    
    }
    public String countAndSay(int n) {
       String result="1";
        for(int i=1;i<n;i++)
        {
            result=count(result);
        }
        return result;

    }
}