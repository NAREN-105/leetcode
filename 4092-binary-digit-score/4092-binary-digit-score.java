class Solution {
    public int calculateScore(int a, int b) {
    String a1=Integer.toBinaryString(a);
    String b1=Integer.toBinaryString(b);
    
    int s1=Integer.bitCount(Integer.valueOf(a1,2));
    int s2=Integer.bitCount(Integer.valueOf(b1,2));
    if(s1>=s2)
    {
        return s1*s2;
    }
    return (int)s2/s1;   
    }
}