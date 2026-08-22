class Solution {
    public boolean checkDivisibility(int n) {
    int val=n;
    int sum=0;
    int prod=1;
    while(val>0){
        int dig=val%10;
    sum+=dig;
    prod*=dig;
    val/=10;    
    }
    return n%(sum+prod)==0;    
    }
}