class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;
        int[] s = new int[n + 1];
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;
        int head = 2; 
        int tail = 3; 
        int countOfOnes = 1; 
        int numToAppend = 1; 
        while (tail < n) {
            int repeats = s[head]; 
            for (int i = 0; i < repeats && tail < n; i++) {
                s[tail] = numToAppend;
                if (numToAppend == 1) {
                    countOfOnes++;
                }
                tail++;
            }
            numToAppend = 3 - numToAppend; 
            head++;
        }
        return countOfOnes;
    }
}