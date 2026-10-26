class Solution {
    public int compress(char[] chars) {

        int index=0;
        int i=0;

        while(i<chars.length)
        {
            char curr_char = chars[i];
            int cnt=0;

            while(i<chars.length && curr_char==chars[i])
            {
                cnt++;
                i++;
            }

            chars[index]=curr_char;
            index++;

            if(cnt>1)
            {
                String count = Integer.toString(cnt);

                for(char ch:count.toCharArray())
                {
                    chars[index]=ch;
                    index++;
                }
            }
        }

        return index;
        
    }
}