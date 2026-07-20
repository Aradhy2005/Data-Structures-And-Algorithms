class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] copy = new int[grid.length*grid[0].length];
        
        int idx=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                copy[idx++]=grid[i][j];
            }
        }

        k%=copy.length;
        
        reverse(copy,0,copy.length-1);
        reverse(copy,0,k-1);
        reverse (copy,k,copy.length-1);
        
        List<List<Integer>> res = new ArrayList<>();
        
        idx=0;
        
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
                temp.add(copy[idx++]);
            }
            
            res.add(temp);
        }
        
     
        return res;
    }
    
    public void reverse(int [] copy,int start,int end)
    {
        int low=start;
        int high=end;
        
        while(low<high)
        {
            int temp = copy[low];
            copy[low]=copy[high];
            copy[high]=temp;
            
            low++;
            high--;
        }
    }
}