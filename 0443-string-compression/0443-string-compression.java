class Solution {
    public int compress(char[] chars) {
    int l=0;
    int k=0;
    while(l<chars.length)
    {
        char ch=chars[l];
        int count=0;
        while(l<chars.length&&chars[l]==ch)
        {
            l++;
            count++;
        }
       
            chars[k++]=ch;
        if(count>1)
        {
            for(char c:Integer.toString(count).toCharArray())
            {
                chars[k++]=c;
            }
        }
    }
    return k++;
    }
 }