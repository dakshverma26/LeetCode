class Solution {
    public int findUnsortedSubarray(int[] nums)
    {
        int n = nums.length;

        int left = n;
        int right = -1;

        int max = nums[0];

        int min = nums[n-1];

        for(int i=1 , j=n-2 ; i<n && j>=0 ; i++,j-- )
        {
            if( nums[i]<max)
                right=i;
            else
                max=nums[i];

            if( nums[j]>min)
                left=j;
            else
                min=nums[j];    
       }

               if (right == -1)
            return 0;

        return right - left + 1;
    }
}