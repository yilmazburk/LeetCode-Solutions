class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length < 2 || nums.length > 50) return -1;
        
        int largestIndex = 0;
        int secondLargest = 0;
        
        
        //TEST 1: [3,6,1,0]
        //TEST 2: [1,2,3,4]
        //TEST 3: [2,1]
        
        for (int i = 1; i<nums.length; i++) {
            if (nums[i] > nums[largestIndex]) {
                secondLargest = nums[largestIndex];
                largestIndex = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        
        System.gc();
        return nums[largestIndex] >= secondLargest * 2 ? largestIndex : -1;
        
    }
}