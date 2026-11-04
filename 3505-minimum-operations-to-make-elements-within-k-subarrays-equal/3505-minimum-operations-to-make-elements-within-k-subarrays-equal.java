class Solution {
    public long minOperations(int[] arr, int x, int k) {
        
        long[] ans = medianSlidingWindow(arr,x);
        int n =arr.length;
        dp = new long[n][k+1];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        return f(0,ans,k,x, n);

    }
    long mx = (long)1e14;
    long [][] dp;
    private long f(int i, long[] ans, int k, int x, int n){
        if(k == 0)return 0;
        if(i> n - x)return mx;
        if(dp[i][k]!=-1)return dp[i][k];
        long c1 = ans[i] + f(i+x,ans,k-1,x,n);
        long c2 = f(i+1,ans, k, x,n);
        return dp[i][k] = Math.min(c1,c2);
    }

    public long[] medianSlidingWindow(int[] arr, int k) {
        TreeMap<Integer,Integer> min = new TreeMap<>();
        TreeMap<Integer,Integer> max = new TreeMap<>();
        int minSz = 0;
        int maxSz = 0;
        int n = arr.length;
        long[] ans = new long[n-k+1];
        int j = 0;
        long minSum = 0;
        long maxSum = 0;
        for(int i=0;i<n;i++){
            if(minSz == 0 ||  min.lastKey() >= arr[i]){
                min.put(arr[i],min.getOrDefault(arr[i],0)+1);
                minSz++;
                minSum += arr[i];
            }else {
                max.put(arr[i],max.getOrDefault(arr[i],0)+1);
                maxSz++;
                maxSum += arr[i];
            }
            if(i-k>=0){
                if(min.containsKey(arr[i-k])){
                    min.put(arr[i-k],min.get(arr[i-k])-1);
                    if(min.get(arr[i-k])==0)min.remove(arr[i-k]);
                    minSz--;
                    minSum -= arr[i-k];
                }else if(max.containsKey(arr[i-k])){
                    max.put(arr[i-k],max.get(arr[i-k])-1);
                    if(max.get(arr[i-k])==0)max.remove(arr[i-k]);
                    maxSz--;
                    maxSum -= arr[i-k];
                }
            }


            if(minSz > maxSz + 1){
                int key = min.lastKey();
                min.put(key,min.get(key)-1);
                if(min.get(key)==0)min.remove(key);
                minSz--;
                minSum -=key;
                max.put(key,max.getOrDefault(key,0)+1);
                maxSz++;
                maxSum += key;
            }
            if(maxSz>minSz){
                int key = max.firstKey();
                max.put(key,max.get(key)-1);
                if(max.get(key)==0)max.remove(key);
                maxSz--;
                maxSum -= key;
                min.put(key,min.getOrDefault(key,0)+1);
                minSz++;
                minSum += key;
            }
            
            if(i>=k-1){
                long median = min.lastKey();
                long curr = (minSz * median - minSum) +  (maxSum - maxSz * median);

                 ans[j++] = curr;
            }
        }
        return ans;


    }
}