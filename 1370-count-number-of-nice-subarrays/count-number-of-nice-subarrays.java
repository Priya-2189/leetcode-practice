class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int []arr,int k)
    {
        int c=0;
        int left=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                odd++;
            }
            while(odd>k)
            {
                if(arr[left]%2!=0)
                {
                    odd--;
                }
            left++;
            }
            c+=i-left+1;
        }
        return c;
    }
}