class Solution {
    public int findJudge(int n, int[][] trust) {
        for(int i=1;i<=n;i++)
        {
            int p1=0;
            int p2=0;
            for(int j=0;j<trust.length;j++)
            {
            if(trust[j][0]==i)p1++;

            else if(trust[j][1]==i)p2++;
            }


            if(p1==0 && p2==n-1)return i;

        }

        return -1;
    }
}