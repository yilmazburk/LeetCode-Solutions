class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length < 0 || nums.length > 100) return 0;
        if (val < 0 || val > 100) return 0;
        int k = 0;
        
        //TEST: [0,1,2,2,3,0,4,2], val = 2
        //TEST2: [3,2,2,3], val = 3
        
        for (int i = nums.length - 1; i>=0; i--) {
            
            if (nums[i] == val) {
                for (int j = i+1; j<nums.length; j++) {
                    nums[j-1] = nums[j];
                }
            } else {
                k++;
            }
            
        }
        
        return k;
        
    }
}