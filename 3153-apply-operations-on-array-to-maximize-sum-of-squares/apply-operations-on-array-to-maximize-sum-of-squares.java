class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long MOD=1000000007;
        int bit[]=new int[31];
        for(int num:nums)
        {
            for(int i=0;i<31;i++)
            {
              if((num&(1<<i))!=0)
              {
                bit[i]++;
              }
            }
        }
        long arr[]=new long[k];
        for(int j=30;j>=0;j--)
        {
             int count = bit[j];

            for (int i = 0; i < Math.min(count, k); i++) {
                arr[i] += (1L << j);
            }
        }
        long ans = 0;

        for (long num : arr) {
            ans = (ans + (num * num) % MOD) % MOD;
        }

        return (int) ans;
    
    }
}