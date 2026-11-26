class Solution {
    public boolean canAliceWin(int n) {
        int ali = 0;
        int bob = 0;
        int start=10;
        while (n >=start) {
            if(ali==bob){
                ali++;
            }
            else
            {
                bob++;
            }
            n-=start;
            start--;
        }
        return ali > bob;
    }
}