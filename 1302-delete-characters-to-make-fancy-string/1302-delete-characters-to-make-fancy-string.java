class Solution 
{
    public String makeFancyString(String s) 
    {
        StringBuilder result = new StringBuilder();
        char prevs = ' ';
        int count = 0;

        for(char current : s.toCharArray())
        {
            count = (current == prevs) ? ++count : 1;

            if(count < 3)
            {
                result.append(current);
            }

            prevs = current;
        }

        return result.toString();
    }
}