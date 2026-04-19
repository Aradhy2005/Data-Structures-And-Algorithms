class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldcolor=image[sr][sc];
        
        if(oldcolor==color)return image;

        dfs(image,sr,sc,color,oldcolor);

        return image;
        
    }


    public void dfs(int[][] image,int sr,int sc,int color,int oldcolor)
    {


        if(sr>=image.length || sc>=image[0].length|| sr<0 || sc<0 || image[sr][sc]!=oldcolor)
        {
            return;
        }

        image[sr][sc]=color;


        dfs(image,sr+1,sc,color,oldcolor);
        dfs(image,sr-1,sc,color,oldcolor);
        dfs(image,sr,sc+1,color,oldcolor);
        dfs(image,sr,sc-1,color,oldcolor);

    }
}