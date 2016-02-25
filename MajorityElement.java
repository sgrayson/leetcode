public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums)
        {
            Integer c = map.get(n);
            if (c == null)
            {
                c = 0;
            }
            if (c+1 > nums.length/2)
            {
                return n;
            }
            map.put(n,c+1);
        }
        
        return 0;
    }
}