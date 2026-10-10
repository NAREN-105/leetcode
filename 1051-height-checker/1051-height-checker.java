class Solution {
    public int heightChecker(int[] heights) {
        ArrayList<Integer>as=new ArrayList<>();
        int co = 0;
        
        for (int i = 0; i < heights.length; i++) {
            as.add(heights[i]);
        }
        Collections.sort(as);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] ==as.get(i)) {
                continue;
            } else {
                co++;
            }

        }
        return co;
    }
}