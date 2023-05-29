class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length < 1 || nums.length > 10000) return -1;
        if (nums.length == 1) return 0;
        
        //TEST 1: [1,7,3,6,5,6]
        //TEST 2: [1,2,3]
        //TEST 3: [2,1,-1]
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