class Solution {
    boolean check(TreeMap<Integer, Set<Integer>> inv) {
        int first = inv.firstKey();
        if(inv.size() == 1) {
            if(inv.get(first).size() == 1) return true;
            return false;
        }
        if(inv.size() > 2) return false;
        int last = inv.lastKey();
        return first * 2 == last;
    }
    public int getLength(int[] nums) {
        int n = nums.length;
        int ans = 1;
        for(int i=0; i<n; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            TreeMap<Integer, Set<Integer>> inv = new TreeMap<>();
            for(int j=i; j<n; j++) {
                int x = nums[j];
                int old = freq.getOrDefault(x, 0);
                freq.put(x, old+1);
                if(inv.containsKey(old)) {
                    inv.get(old).remove(x);
                    if(inv.get(old).size() == 0) inv.remove(old);
                }
                inv.computeIfAbsent(old+1, k->new HashSet<>()).add(x);
                if(check(inv)) {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}