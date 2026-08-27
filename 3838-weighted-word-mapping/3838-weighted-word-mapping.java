class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    StringBuilder sb=new StringBuilder();
    String b="zyxwvutsrqponmlkjihgfedcba";
    int count=0;
    for(int i=0;i<words.length;i++){
        String st=words[i];
        int weight=0;
        int weightind=0;
        for(char ch:st.toCharArray()){
            int  cha=ch-'a';
            weight+=weights[cha];
        }
        int val=weight%26;
        sb.append(b.charAt(val));
    }
    return sb.toString();
}
}