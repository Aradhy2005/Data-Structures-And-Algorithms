class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        int[] freq = new int[26];

        for(char ch:letters){
            freq[ch-'a']++;
        }

        return solve(0,words,freq,score);
        
    }

    public int solve(int idx,String[] words,int[] freq, int[] score)
    {
        if(idx==words.length)return 0;

        int notTake = solve(idx+1,words,freq,score);

        String word = words[idx];

        int[] need = new int[26];
        int wordScore = 0;

        for(char ch:word.toCharArray()){
            need[ch-'a']++;
            wordScore+=score[ch-'a'];
        }

        for(int i=0;i<26;i++){
            if(need[i]>freq[i])
            return notTake;
        }

        for(int i=0;i<26;i++)
        {
            freq[i]-=need[i];
        }

        int take = wordScore+solve(idx+1,words,freq,score);

        for(int i=0;i<26;i++)
        {
            freq[i]+=need[i];
        }

        return Math.max(take,notTake);
    }
}