class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        for (int pos : position) {
            if ((pos & 1) == 0) {
                evenCount++;
            }
        }
        int oddCount = position.length - evenCount;
        return Math.min(evenCount, oddCount);
    }
}