class Solution {
    public boolean checkIfExist(int[] arr) {
    HashSet<Integer>hm=new HashSet<>();
    for(int num:arr)
    {
        if(hm.contains(2*num)||(num%2==0&&hm.contains(num/2)))
        {
            return true;
        }
        hm.add(num);
    }
    return false;
    
    }
}