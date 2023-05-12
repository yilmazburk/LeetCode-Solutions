class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1 || nums.length > 30000) return 0;
      
        //TEST1 nums = [1]
        //TEST2 nums = [1,1,2]
        //TEST3 nums = [0,0,1,1,1,2,2,3,3,4]
        
        int k = 0;
        int value = nums[k++];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] != value) {
                value = nums[i];
                nums[k++] = nums[i];
            }
        }
        
        return k;
        
    }
}