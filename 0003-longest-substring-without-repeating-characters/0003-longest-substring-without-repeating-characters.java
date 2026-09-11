class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int low=0;
        int high=0;

        int ans=Integer.MIN_VALUE;

        int count=0;
        int n=s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        char data;
        int datacount=0;
        
        if(n==0)
        return 0;


        while(high<n)
        {
            data = s.charAt(high);
            map.put( data , map.getOrDefault(data,0)+1);

            

            while(map.get(data) > 1 )
            {
                
                if( count > ans  )
                ans=count;

                char shift=s.charAt(low);

                datacount = map.get(shift);
                datacount-=1;

                map.put(shift,datacount);

                if(datacount==0)
                 map.remove(shift);

                low++;
                count--;
            }
            count++;
            high++; 
            }


            return ans>count?ans:count;
        
    }
}
