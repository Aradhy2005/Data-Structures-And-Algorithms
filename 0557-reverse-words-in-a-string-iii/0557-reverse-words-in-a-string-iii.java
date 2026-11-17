class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] wrd = s.split(" ");
        for(int i=0;i<wrd.length;i++)
        {
            sb.append(reverse(wrd[i]));

            if(i!=wrd.length-1)
            sb.append(" ");

        }

        return sb.toString();
        
    }

    public String reverse(String s)
    {
        char[] str = s.toCharArray();
        int i=0;
        int j=str.length-1;

        while(i<j)
        {
            char temp = str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }

        return String.valueOf(str);
    }
}