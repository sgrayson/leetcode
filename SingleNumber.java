public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int n : nums)
        {
            if (map.containsKey(n))
            {
                map.remove(n);
            }
            else
            {
                map.put(n,n);
            }
        }
        
        return map.entrySet().iterator().next().getKey();
    }
}