class Solution {
    public boolean completePrime(int num) {
    if(num<2)
    {
        return false;
    }
    String st=String.valueOf(num);
    boolean b=false;
    for(int i=st.length()-1;i>=0;i--)
    {
     String sub=st.substring(i);
     int val1=Integer.parseInt(sub);
    String sub2=st.substring(0,i+1);
     int val2=Integer.parseInt(sub2);
    if(val1<2||val2<2)
    {
      return false;
    }
    boolean b1=prime(val1);
    boolean b2=prime(val2);
    if(!b1||!b2)
    {
        return false;
    }
    }
    return true;
    }
    public static boolean prime(int val)
    {
       boolean is_P=true;
       if(val<2)
       {
        return false;
       }
        for(int j=2;j<=Math.sqrt(val);j++)
    {
        if(val%j==0)
        {
            return false;
        } 
    }
    return true;
    }
}