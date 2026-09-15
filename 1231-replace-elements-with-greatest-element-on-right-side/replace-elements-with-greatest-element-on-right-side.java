class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxr=-1;
        for(int i=n-1;i>=0;i--)
        {
            int curr=arr[i];
            arr[i]=maxr;
            if(curr>maxr)
            {
                maxr=curr;
            }
        }
        return arr;
    }
}