class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
     String word[]=paragraph.toLowerCase().split("[!?' ,;.]+");
     ArrayList<String>as=new ArrayList<>();
        for(int i=0;i<word.length;i++){
            boolean b=true;
     for(String y:banned){
        if(y.equals(word[i])){
            b=false;
            break;
        }
     }
     if(b){
       as.add(word[i]);
     }
     }
     Map<String,Integer>m=new HashMap<>();
     for(String w:as){
        m.put(w,m.getOrDefault(w,0)+1);
     } 
     int max=Integer.MIN_VALUE;
     String st=" ";
     for(String k:m.keySet()){
        int val=m.get(k);
        if(val>max){
            max=val;
            st=k;
        } 
     }
     return st;
    }
}