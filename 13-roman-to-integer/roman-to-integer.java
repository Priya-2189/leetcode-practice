class Solution {
    public int romanToInt(String s) {
        int I=1;
        int V=5;
        int X=10;
        int L=50;
        int C=100;
        int D=500;
        int M=1000;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int curr=0;
            int next=0;
            if(s.charAt(i)=='I')
            {
               curr=I;
            }
            else if(s.charAt(i)=='V')
            {
               curr=V;
            }
            else if(s.charAt(i)=='X')
            {
               curr=X;
            }
            else if(s.charAt(i)=='L')
            {
               curr=L;

            }
            else if(s.charAt(i)=='C')
            {  
                curr=C;

            }
            else if(s.charAt(i)=='D')
            { 
                curr=D;

            }
            else
            {
               curr=M;

            }

            if(i+1<s.length( ))
            {

            if (s.charAt(i + 1) == 'I')
             { 
                next = I;
             } 
             else if (s.charAt(i + 1) == 'V') 
             { next = V;
              }
               else if (s.charAt(i + 1) == 'X')
                {
                     next = X; 
                } 
                else if (s.charAt(i + 1) == 'L') 
                { 
                    next = L; 
                 }
                else if (s.charAt(i + 1) == 'C') {
                   next = C;
                }
                else if (s.charAt(i + 1) == 'D') { 
                    next = D;
                }
                else { 
                    next = M;
                    } 
            } 
                if (curr < next)
                { 
                    sum -= curr;
                }
                else { 
                    sum += curr; 
                   } 
                   
              }
        
         return sum;
      
    }
}