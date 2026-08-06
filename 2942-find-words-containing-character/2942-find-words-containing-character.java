class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
    ArrayList<Integer> as=new ArrayList<>();
    for(int i=0;i<words.length;i++)
    {
        String st=words[i];
        for(char ch:st.toCharArray())
        {
            if(ch==x)
            {
            as.add(i);
            break;
            }
        }
    }
    return as;  
    }
}