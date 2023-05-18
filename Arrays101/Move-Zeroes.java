class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <=1 || nums.length > 10000) return;

        
        //TEST 1: [0,1,0,3,12]
        //TEST 2: [0,1]
        
        int k = 0; //Non-zero count
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != 0) {
               nums[k++] = nums[i];
            } 
        }
        
        for (int i = 0; i < nums.length - k; i++) {
            nums[nums.length-1-i] = 0;
        }
        
    }
}