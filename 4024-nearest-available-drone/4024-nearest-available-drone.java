class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
    int ans=-1;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<drones.length;i++)
    {
        int dr1=drones[i][0];
        int dr2=drones[i][1];
        int dr_rag=drones[i][2];
        int dis=Math.abs(dr1-target[0])+Math.abs(dr2-target[1]);
        if(dis<min&&dis<=dr_rag)
        {
            min=dis;
            ans=i;
        }
    }   
    return ans;
    }
}