class Solution {
    public int[] scoreValidator(String[] events) {
    int count=0;
    int score=0;
    for(int i=0;i<events.length;i++)
    {
        String val=events[i];
        for(char ch:val.toCharArray())
        {
        if(Character.isDigit(ch))
        {
        score+=Integer.parseInt(val);
        }
        }
        if(val.equals("W"))
        {
            count+=1;
            if(count>=10)
            {
                break;
            }
        }
        else if(val.equals("WD")||val.equals("NB"))
        {
            score+=1;
        }
    }
    int arr[]=new int[2];
    arr[0]=score;
    arr[1]=count;
    return arr;    
    }
}