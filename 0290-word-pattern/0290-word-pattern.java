class Solution {
    public boolean wordPattern(String pattern, String s) {
    String arr[]=s.split(" ");
    if(arr.length!=pattern.length()){
        return false;
    }    
    LinkedHashMap<Character,String>hs1=new LinkedHashMap<>();
    LinkedHashMap<String,String>hs2=new LinkedHashMap<>();
    ArrayList<String>as1=new ArrayList<>();
    ArrayList<String>as2=new ArrayList<>();
    int l=0;
    int k=0;
    for(char ch:pattern.toCharArray())
    {
        hs1.put(ch, hs1.getOrDefault(ch, "") + l++ + ",");
    }
    for(String str:arr){
     hs2.put(str, hs2.getOrDefault(str, "") + k++ + ",");
    }
    for(char ch:hs1.keySet()){
        as1.add(hs1.get(ch));
    }
    for(String ch:hs2.keySet()){
        as2.add(hs2.get(ch));
    }
    // System.out.println(Arrays.toString(arr));
    // System.out.println(hs1);
    // System.out.println(hs2);
    // System.out.println(as1);
    // System.out.println(as2);
    if(as1.size()!=as2.size()){
        return false;
    } 
    for(int i=0;i<as1.size();i++)
    {
        if(!as1.get(i).equals(as2.get(i))){
            return false;
        }
    }
    return true;
    }
}