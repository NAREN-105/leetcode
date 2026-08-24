class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    String val="abcdefghij";
    int sum1=0;
    int sum2=0;
    int sum3=0;
    for(char ch:firstWord.toCharArray()){
        sum1=sum1*10+(ch-'a');
    }  
    for(char ch:secondWord.toCharArray()){
        sum2=sum2*10+(ch-'a');
    } 
     for(char ch:targetWord.toCharArray()){
        sum3=sum3*10+(ch-'a');
    }
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    int comp=sum1+sum2;
    return comp==sum3; 
    }
}