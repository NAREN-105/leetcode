class Solution {
    public String removeTrailingZeros(String num) {
    StringBuilder sb=new StringBuilder(num);
    while(sb.charAt(sb.length()-1)=='0'){
        int val=sb.length()-1;
        sb=sb.deleteCharAt(val);
        }
        return sb.toString();   
    }
}