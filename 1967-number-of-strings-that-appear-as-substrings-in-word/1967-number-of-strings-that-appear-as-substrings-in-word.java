class Solution {
    public int numOfStrings(String[] patterns, String word) {
    int co=0;
    for(String patt:patterns)
    {
        if(word.contains(patt))
        {
            co++;
        }
    }
    return co;    
    }
} 