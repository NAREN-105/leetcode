class Solution {
    public String trimTrailingVowels(String s) {
    String st=""; 
    int count=0; 
    for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        if(ch=='a'||
           ch=='e'||
           ch=='i'||
           ch=='o'||
           ch=='u'
        )
        {
        count++;
        }
        else
        {
            break;
        }
    }
    if(count==0)
    {
        return s;
    }
    else if(count==s.length()){
        return "";
    }
    System.out.println(count);
    for(int i=0;i<s.length()-count;i++){
        st+=s.charAt(i);
    }
    return st;
    }
}