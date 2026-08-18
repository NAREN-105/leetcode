class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    ArrayList<Integer>as=new ArrayList<>();
    for(int i=0;i<nums1.length;i++)
    {
        int max=0;
        int val=nums1[i];
        int ind=0;
        for(int j=0;j<nums2.length;j++)
        {
            if(val==nums2[j])
            {
                ind=j;
                break;
            }
        }
        val=nums2[ind];
    for(int k=ind;k<nums2.length;k++)
                {
                    if(nums2[k]>val)
                    {
                        as.add(nums2[k]);
                        break;
                    }
                    else if(k>=nums2.length-1)
                    {
                        as.add(-1);
                        
                    }
                }
            }
        int ans[]=new int[as.size()];
        int y=0;
        for(int i:as)
        {
            ans[y++]=i;
        } 
        return ans;
    }
}