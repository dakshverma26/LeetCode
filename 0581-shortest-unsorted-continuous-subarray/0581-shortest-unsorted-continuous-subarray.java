class Solution {
    public int findUnsortedSubarray(int[] nums)
    {
        int n = nums.length;

        int left = n;
        int right = -1;

        int max = nums[0];

        // Left -> Right
        for (int i = 1; i < n; i++) {

            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
        }

        int min = nums[n - 1];

        // Right -> Left
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] > min) {
                left = i;
            } else {
                min = nums[i];
            }
        }

        if (right == -1)
            return 0;

        return right - left + 1;
    }
}