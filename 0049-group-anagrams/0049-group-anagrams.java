class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res=new ArrayList<>();

        HashMap<String,List<String>> mpp = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if(mpp.containsKey(key))
            {
                List<String> list = mpp.get(key);
                list.add(strs[i]);
                mpp.put(key,list);
            }

            else{

                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                mpp.put(key,temp);
            }
            
        }

        for(String key: mpp.keySet()) 
        {
            res.add(mpp.get(key));
        }

        return res;       
    }
}