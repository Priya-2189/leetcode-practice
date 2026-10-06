class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int num[]=new int[2];
        int l=0;
        int r=numbers.length-1;
        while(l<r)
        {
            int sum=numbers[l]+numbers[r];
            if(sum==target)
            {
                num[0]=l+1;
                num[1]=r+1;
                return num;
            }
            else if (sum<target)
            {
                l++;
            }
            else 
            {
                r--;
            }
        }

       return num;
    }
}