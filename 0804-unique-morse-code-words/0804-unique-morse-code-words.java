class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    String str[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    HashSet<String> hs=new HashSet<>();  
    for(String s:words)
    {
    StringBuilder sb=new StringBuilder();
    for(char  ch:s.toCharArray())
    {
     sb.append(str[ch-'a']);
    }
    hs.add(sb.toString());
    }
    return hs.size();    
    }
}