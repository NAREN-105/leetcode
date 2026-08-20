class Solution {
    public int percentageLetter(String s, char letter) {
    int n=s.length();
    int count=0;
    for(char ch:s.toCharArray()){
    if(letter==ch)    
    count++;
    }
    float div_val=(count*100)/n; 
    return Math.abs((int)div_val);
    }
}