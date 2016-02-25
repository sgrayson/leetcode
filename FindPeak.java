public class FindPeak {
    public int findPeakElement(int[] nums) {
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] < prev)
            {
                return i-1;
            }
            prev = nums[i];
        }
        return nums.length-1;
    }
}