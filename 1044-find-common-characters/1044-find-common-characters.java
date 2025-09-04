class Solution {
    public List<String> commonChars(String[] words) {

        int[] common = new int[26];

        int[] current = new int[26];

        for(int i=0;i<words[0].length();i++)
        {
            common[words[0].charAt(i)-'a']++;
        }

        for(int i=1;i<words.length;i++)
        {
            Arrays.fill(current, 0);
            for(int j=0;j<words[i].length();j++)
            {
                current[words[i].charAt(j)-'a']++;
            }


            for(int k=0;k<26;k++)
            {
                common[k]=Math.min(common[k],current[k]);
            }

        }

        List<String> res = new ArrayList<>();

        for(int i=0;i<26;i++)
        {
            while(common[i]>0)
            {
                res.add(String.valueOf((char)(i+'a')));
                common[i]--;
            }
            
        }

        return res;
        
        

        
    }
}