class Solution {
    public String finalString(String s) {
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        //System.out.println("charAt :"+ch);
        if(ch=='i')
        {
        sb=sb.reverse();
               continue;
        }
        else if(ch!='i')
        {
              sb.append(ch);
        }   
    }
    return sb.toString();
}
}