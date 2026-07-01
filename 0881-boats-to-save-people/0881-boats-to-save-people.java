class Solution {
    public int numRescueBoats(int[] people, int limit) {
     Arrays.sort(people);
     int lef=0;
     int rig=people.length-1;
     int boat=0;
     while(lef<=rig)
     {
        if(people[lef]+people[rig]<=limit)
        {
           
            lef++;
        }
         rig--;
       boat++;
     }
     return boat;
    }
}