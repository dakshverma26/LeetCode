class Solution {
    public int totalFruit(int[] fruits) 
    {
        HashMap<Integer,Integer> basket  = new HashMap<>();
        int low =0;
        int high=0;


        int ans=Integer.MIN_VALUE;
        int fruit=0;
        int count=0;
        int n=fruits.length;


        while(high<n)
        {

             fruit = fruits[high];
            basket.put(fruit,basket.getOrDefault(fruit,0)+1);

            while( basket.size()>2 )
            {
                if(ans < count )
                ans=count;


                fruit = fruits[low];
                int total = basket.get(fruit);
                total-=1;

                basket.put(fruit,total);
                if(total==0)
                {
                    basket.remove(fruit);
                }

                low++;
                count--;

            }
            count++;
            high++;
        }



        return ans>count?ans:count;
    }
}