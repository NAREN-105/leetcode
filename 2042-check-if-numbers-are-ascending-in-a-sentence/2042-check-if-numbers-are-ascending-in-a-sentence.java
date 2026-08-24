class Solution {
    public boolean areNumbersAscending(String str) {
    String split[]=str.split(" ");
    ArrayList<Integer>as=new ArrayList<>();
    for(String s:split){
        if(s.matches("\\d+")){
            as.add(Integer.parseInt(s));
        }
    }
    for(int i=1;i<as.size();i++){
        if(as.get(i-1)>=as.get(i)){
            return false;
        }
    }
    return true;
    }
}