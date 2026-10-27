class Solution {
    public int peakValleyDifference(int[] arr) {
      int peak=0;
      int valle=0;
      for(int i=1;i<arr.length-1;i++)
      {
        if((arr[i]<arr[i-1])&&(arr[i]<arr[i+1]))
        {
            valle+=arr[i];
        }
        else if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1]))
        {
           peak+=arr[i];
        }
        else
        {
            continue;
        }
      }
      return peak-valle;
    }
}