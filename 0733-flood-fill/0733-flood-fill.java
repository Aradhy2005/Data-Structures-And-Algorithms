class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int init_color=image[sr][sc];

        if(image[sr][sc]!=color)
        dfs(sr,sc,image,init_color,color);

        return image;

        
    }

    public void dfs(int sr,int sc,int[][] image,int init_color,int color)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=init_color)return;

        image[sr][sc]=color;

        dfs(sr+1,sc,image,init_color,color);
        dfs(sr-1,sc,image,init_color,color);
        dfs(sr,sc-1,image,init_color,color);
        dfs(sr,sc+1,image,init_color,color);
    }
}