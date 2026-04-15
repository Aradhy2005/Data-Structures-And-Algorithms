class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(target))
            {

                int temp=Math.min(Math.abs(startIndex-i),n-Math.abs(startIndex-i));
                ans=Math.min(ans,temp);
                

            }

        }

        return (ans==Integer.MAX_VALUE)?-1:ans;
        
    }
}