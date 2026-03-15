class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int num:nums)
        {
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mpp.get(a)-mpp.get(b));

        for(int num:mpp.keySet())
        {
            pq.add(num);

            if(pq.size()>k)pq.remove();
        }

        int[] res=new int[k];

        int i=0;

        while(!pq.isEmpty())
        res[i++]=pq.remove();

        return res;
        
    }
}