class Solution {
    public String reversePrefix(String s, int k) {
    String str=""; 
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        if(i<k)
    {
    sb.append(s.charAt(i));    
    }
    else
    {
        str+=s.charAt(i);
    } 
       
    }
    return sb.reverse().toString()+str; 
}
}