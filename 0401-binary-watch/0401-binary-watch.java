class Solution {
    public List<String> readBinaryWatch(int turnedOn) {

        List<String> res=new ArrayList<>();

        for(int hour=0;hour<12;hour++)
        {
            for(int min=0;min<60;min++)
            {
                int total=Integer.bitCount(hour)+Integer.bitCount(min);

                if(turnedOn==total)
                {
                    String temp=hour+":"+ ((min<10)?("0"+min):min);
                    res.add(temp);
                }
            }
        }

        return res;
        
    }
}