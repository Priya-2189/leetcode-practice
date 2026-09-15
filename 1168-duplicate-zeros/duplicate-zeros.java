class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=arr[i];
        }
        int i=0;
        int j=0;
        while(i<n&&j<n)
        {
            if(num[i]!=0)
            {
                arr[j]=num[i];
                j++;
            }
            else
            {
                arr[j]=0;
                j++;
                if(j<n)
                {
                    arr[j]=0;
                    j++;

                }
            }
            i++;
        }
        
    }
}