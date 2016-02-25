public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if (map.containsKey(c1) && map.get(c1) != c2)
            {
                return false;
            }
            map.put(c1,c2);
        }
        
        map.clear();
        
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = t.charAt(i), c2 = s.charAt(i);
            if (map.containsKey(c1) && map.get(c1) != c2)
            {
                return false;
            }
            map.put(c1,c2);
        }
        
        return true;
    }
}