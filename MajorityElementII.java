public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums)
        {
            Integer c = map.get(n);
            if (c == null)
            {
                c = 0;
            }
            if (!set.contains(n) && c+1 > nums.length/3)
            {
                list.add(n);
                set.add(n);
            }
            map.put(n,c+1);
        }
        
        return list;
    }
}