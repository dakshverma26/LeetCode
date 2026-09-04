class Solution {
    public int minSubArrayLen(int target, int[] arr) 
    {
        int high=0;
        int low=0;

        int sum=0;
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
 
      while(high<n)
      {
        sum = sum + arr[high];

        while( sum >= target && low<=high  )
        {
            int length = high-low+1;
            ans= Math.min(ans,length);
            sum -= arr[low];
            low++;
          
        }
        high++;
      }
       return ans==Integer.MAX_VALUE?0:ans;

    }
   
}