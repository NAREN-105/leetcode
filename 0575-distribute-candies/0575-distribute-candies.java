class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int num : candyType){
            hs.add(num);
        }
        if(hs.size() > (n/2)){
            return n/2;
        }
        return hs.size();
        
    }
}