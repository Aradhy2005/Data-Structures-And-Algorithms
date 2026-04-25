class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] vis=new boolean[n];

        return dfs(adj,source,destination,vis);
    }

    public boolean dfs(List<List<Integer>> adj, int source ,int destination,boolean[] vis )
    {
        if(source==destination)return true;
        vis[source]=true;

        for(int neighbour : adj.get(source))
        {
            if(!vis[neighbour])
            {
                if(dfs(adj,neighbour,destination,vis))return true;
            }
        }

        return false;
    }
}