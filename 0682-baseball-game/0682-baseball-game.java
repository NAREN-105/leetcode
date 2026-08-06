class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer>as=new ArrayList<>();
        for(String op:operations)
        {
            if(op.equals("c")||op.equals("C"))
            {
                as.remove(as.size()-1);
            }
            else if(op.equals("D")||op.equals("d"))
            {
                int len=as.get(as.size()-1);
                as.add(len*2);
            }
            else if(op.equals("+"))
            {
                as.add(as.get(as.size()-1)+as.get(as.size()-2));
            }
            else
            {
                as.add(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int i:as)
        {
            sum+=i;
        }
        return sum;
    }
}