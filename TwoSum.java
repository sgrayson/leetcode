public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i)
            {
                int idx = map.get(diff);
                indices[0] = Math.min(idx,i);
                indices[1] = Math.max(idx,i);
                break;
            }
        }
        
        return indices;
    }
}