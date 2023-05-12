class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length < 1) return 0;
        if (nums.length > 100000) return 0;
        
        int max = 0;
        int counter = 0;
        
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 0;
            }
        }
        
        if (counter > max) {
            return counter;
        }
        
        return max;
    }
}