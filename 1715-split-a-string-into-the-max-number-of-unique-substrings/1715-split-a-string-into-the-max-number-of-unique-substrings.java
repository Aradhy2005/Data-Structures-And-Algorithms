class Solution {
    private int maxLen = 0;
    private void backtrack(String s, int index, Set<String>set){
        if(index == s.length()){
            return;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            String sub = s.substring(index, i);
            if (set.contains(sub)){ 
                continue;
            }
            set.add(sub);
            maxLen = Math.max(maxLen, set.size());
            backtrack(s, i, set);
            set.remove(sub);
        }
        
    }
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        backtrack(s, 0, set);
        return maxLen;
    }
}