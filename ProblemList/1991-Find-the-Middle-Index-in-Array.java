class Solution {
    public int findMiddleIndex(int[] nums) {
        if (nums.length < 1 || nums.length > 100) return -1;
        if (nums.length == 1) return 0;
        
        //TEST 1: [2,3,-1,8,4]
        //TEST 2: [1,-1,4]
        //TEST 3: [2,5]
        // Time Complexity O(2n) = O(n)
        
        int leftSum = 0;
        int rightSum = 0;
        
        for (int i = 1;i<nums.length; i++) {
            rightSum += nums[i];
        }
        
        
        for (int i = 0; i< nums.length; i++) {
            
            if (i > 0) {
                leftSum += nums[i-1];
                rightSum -= nums[i];
            }
            
            if (leftSum == rightSum) {
                System.gc();
                return i;
            } 
        }
        System.gc();
        return -1;
    }
}