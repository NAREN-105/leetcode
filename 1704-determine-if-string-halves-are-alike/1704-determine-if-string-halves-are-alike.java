class Solution {
    public boolean halvesAreAlike(String s) {
     String st1=s.substring(0,s.length()/2);
     String st2=s.substring(s.length()/2,s.length());
    //  System.out.println("st1 :"+st1);
    //  System.out.println("st2 :"+st2);
    int left=0;
    int rig=0;
    st1=st1.toLowerCase();
    st2=st2.toLowerCase();
    for(char ch:st1.toCharArray())
    {
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        left++;
    }
     for(char ch:st2.toCharArray())
    {
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        rig++;
    }
     return left==rig;   
    }
}