class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String words[]=text.split(" ");
    int co=0;
    //System.out.println(Arrays.toString(words));
    for(int i=0;i<words.length;i++)
    {
        String wor=words[i];
      //  System.out.println(wor);
        int count=0;
        for(int j=0;j<brokenLetters.length();j++)
        {
            char ch=brokenLetters.charAt(j);
     if(wor.contains(String.valueOf(ch)))
     {
        count++;
     }
    }
    if(count>=1)
    {
        co++;
    }
    }
    // System.out.println("w :"+words.length);
    // System.out.println("co :"+co);
    return words.length-co;
    }
}