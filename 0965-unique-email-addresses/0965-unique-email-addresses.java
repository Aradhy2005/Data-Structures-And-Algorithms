class Solution {
    public int numUniqueEmails(String[] emails) {

        int cnt=emails.length;

        Set<String> ans= new HashSet<>();


        for(int i=0;i<emails.length;i++)
        {
            String local="";
            int pos=0;
            for(int j=0;j<emails[i].length();j++)
            {
                char c=emails[i].charAt(j);

                if(c=='@' || c=='+')
                {
                    if(c=='@')
                    {
                        pos=j;
                    }

                    break;
                }

                else if(c=='.')
                continue;

                else local+=c;

            }

            if(pos!=0)
            {
                ans.add((local+emails[i].substring(pos)));
            }

            else
            {

                for(int k=emails[i].length()-1; k>=0 ; k--)
                {
                    if(emails[i].charAt(k)=='@')
                    {
                        pos=k;
                        break;
                    }
                }

                 ans.add((local+emails[i].substring(pos)));


                

            }
        }

        return ans.size();
        
    }
}