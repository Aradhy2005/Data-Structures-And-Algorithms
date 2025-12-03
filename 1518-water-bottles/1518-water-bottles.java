class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int ans=numBottles;

        while(numBottles>=numExchange)
        {
            int drank=numBottles/numExchange;
            int empty=numBottles%numExchange;

            ans+=drank;

            numBottles=drank+empty;



        }

        return ans;
    }
}