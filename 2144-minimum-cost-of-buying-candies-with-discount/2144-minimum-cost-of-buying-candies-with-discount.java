class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int min_cost=0;
        int position=0;

        for(int i=cost.length-1;i>=0;i--)
        {
            if(position%3!=2)
            min_cost+=cost[i];

            position++;
        }

        return min_cost;
        
    }
}