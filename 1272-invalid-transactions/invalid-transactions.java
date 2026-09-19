class Solution {
    public List<String> invalidTransactions(String[] transactions) {
     List<String>al=new ArrayList<>();
     
     int n=transactions.length;
     boolean invalid[]=new boolean[n];
      String[] names = new String[n];
        int[] times = new int[n];
        int[] amounts = new int[n];
        String[] cities = new String[n];
           for (int i = 0; i < n; i++) {
            String[] parts = transactions[i].split(",");
            names[i] = parts[0];
            times[i] = Integer.parseInt(parts[1]);
            amounts[i] = Integer.parseInt(parts[2]);
            cities[i] = parts[3];
        }

     for(int k=0;k<n;k++)
     {
        if(amounts[k]>=1000)
                {
                  invalid[k]=true;
                }
            for(int j=0;j<n;j++)
            {
               
                if(k!=j&&names[k].equals(names[j])&&!cities[k].equals(cities[j])&&Math.abs(times[k]-times[j])<=60)
                {
                    invalid[k]=true;
                }
            }
     }
    
    for(int p=0;p<n;p++)
    {
        if(invalid[p])
        {
            al.add(transactions[p]);
        }
    }
    
    return al;
    }
}
    