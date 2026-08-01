class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ls=new ArrayList<>();
        for(int h=0;h<12;h++)
        {
            for(int m=0;m<60;m++)
            {
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn)
                {
                    ls.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return ls;
    }
}