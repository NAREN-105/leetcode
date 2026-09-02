class Solution {
    public boolean uniformArray(int[] nums1) {
     int nums2[]=new int[nums1.length];
     for(int i=0;i<nums1.length;i++){
        for(int j=i+1;j<nums1.length;j++){
            nums2[i]=nums1[i]-nums1[j];
        }
     }
     return true;  
    }
}