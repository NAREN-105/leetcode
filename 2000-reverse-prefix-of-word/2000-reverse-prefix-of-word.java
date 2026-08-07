class Solution {
    public String reversePrefix(String word, char ch) {
    int index=word.indexOf(String.valueOf(ch));
      if(index==-1)
    {
        return word;
    }
    String st=word.substring(0,index+1);
    String str=word.substring(index+1,word.length());
    StringBuilder sb=new StringBuilder(st);
    String ans=sb.reverse().toString()+str;
    if(index==-1)
    {
        return word;
    }
    return ans;    
    }
}