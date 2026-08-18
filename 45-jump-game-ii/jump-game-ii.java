class Solution {
    public int jump(int[] nums) {
        int min_jumps = 0;
        int farthest = 0;
        int current_End = 0;

        for(int i=0; i<nums.length - 1; i++){
            farthest = Math.max(farthest, i+nums[i]);

            if(i==current_End){
                current_End = farthest;
                min_jumps++;
            }
        }
        return min_jumps;
    }
}