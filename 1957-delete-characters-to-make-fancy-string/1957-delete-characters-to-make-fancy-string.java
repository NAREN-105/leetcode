class Solution {
    public String makeFancyString(String s) {
    StringBuilder sb=new StringBuilder();
    int p=0;
    for(int i=0;i<s.length();i++)
    {
    if(i>0&&s.charAt(i)==s.charAt(i-1))
    {
    p++;
    }
    else
    {
        p=1;
    }
    if(p>=3)
    {
        continue;
    }
    sb.append(s.charAt(i));
    }
    return sb.toString();
}
}