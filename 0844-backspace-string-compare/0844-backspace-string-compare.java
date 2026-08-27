class Solution {
    public boolean backspaceCompare(String s, String t)
    {
        int end1= s.length()-1;
        int end2=t.length()-1;
        int shift=0 ;
        int shift2=0;

        while(end1>=0 || end2>=0)
        {
            if( end1>=0 && s.charAt(end1)=='#')
            {
                shift++;
                end1--;
                continue;
            }
            
            if( end2>=0 && t.charAt(end2)=='#')
            {
                shift2++;
                end2--;
                continue;
            }

            
            if(shift>0)
            {
                end1--;
                shift--;
            }
            else if(shift2>0)
            {
                end2--;
                shift2--;
            }
            else if( ( end1>=0 && end2>=0 ) &&  s.charAt(end1)  == t.charAt(end2 ) )
            {
                end1--;
                end2--;
            }
            else
              return false;
        }

        return true;
    }
}