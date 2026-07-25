class Solution {
    public int maxProduct(int n) {
    int fir=0;
    int sec=0;
    while(n!=0)
    {
        int dig=n%10;
        if(dig>fir)
        {
        sec=fir;
        fir=dig;    
        }
        else if(dig>sec)
        {
            sec=dig;
        }
        n/=10;
    } 
    return fir*sec; 
    }
}