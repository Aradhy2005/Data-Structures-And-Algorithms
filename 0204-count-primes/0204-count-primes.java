class Solution {
    public int countPrimes(int n) {

        int res=0;

        boolean mark[]=new boolean[n+1];

        Arrays.fill(mark,true);

        for(int i=2;i*i<n;i++)
        {
            if(mark[i]){
                for(int j=i*i;j<=n;j+=i)
                {
                   mark[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++)
        {
            if(mark[i])res++;
        }

        return res;
        
    }
}