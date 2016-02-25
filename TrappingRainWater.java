public class TrappingRainWater {
    public int trap(int[] height) {
        if (height.length == 0)
        {
            return 0;
        }
        
        int curr = height[0];
        int sum = 0;
        int total = 0;
        
        for (int i = 1; i < height.length; i++)
        {
            if (height[i] >= curr)
            {
                total += sum;
                sum = 0;
                curr = height[i];
            }
            else
            {
                sum += (curr - height[i]);
            }
        }
        
        sum = 0;
        curr = height[height.length-1];
        
        for (int i = height.length-2; i >= 0; i--)
        {
            if (height[i] > curr)
            {
                total += sum;
                sum = 0;
                curr = height[i];
            }
            else
            {
                sum += (curr - height[i]);
            }
        }
        
        return total;
    }
}