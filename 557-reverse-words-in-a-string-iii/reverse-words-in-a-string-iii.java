class Solution {
    public String reverseWords(String s) {
        char []arr=s.toCharArray();
        int start=0;
        int n=s.length();
        for(int i=0; i<=s.length();i++)
        {
            if(i==n||arr[i]==' ')
            {
                int k=start;
                int j=i-1;
                while(k<j)
                {
                    char temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                    k++;
                    j--;
                }
                start=i+1;
            }
            
        }
        return new String(arr);

    }
}