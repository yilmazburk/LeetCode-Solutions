class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length < 1 || nums.length > 10000) return 0;
        
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return nums[0] > nums[1] ? nums[0] : nums[1];
        
        //TEST 1: [1,1,2]
        //TEST 2: [1,3,2]
        //TEST 3: [3,3,1]
        //TEST 4: [3,2,1]
        //TEST 5: [5,2,2]
        
        int firstMax = nums[0];
        
        for (int i = 1; i<nums.length; i++) {
            if (firstMax<nums[i]) {
                firstMax = nums[i];
            }
        }
        
        int secondMax = firstMax;
        
        for (int i = 0; i<nums.length; i++) {
            if (secondMax == firstMax) {
                if (nums[i] != firstMax) {
                    secondMax = nums[i];
                }
            } else {
                if (secondMax<nums[i] && nums[i] < firstMax) {
                    secondMax = nums[i];
                }
            }
            
        }
        
        int thirdMax = secondMax;
        
        for (int i = 0; i<nums.length; i++) {
            if (thirdMax == secondMax) {
                if (nums[i] != firstMax && nums[i] != secondMax) {
                    thirdMax = nums[i];
                }
            } else {
                if (thirdMax<nums[i] && nums[i] < firstMax && nums[i] < secondMax) {
                    thirdMax = nums[i];
                }
            }
        }
        
        if (thirdMax == secondMax || thirdMax == firstMax) {
            return firstMax;
        }
        
        return thirdMax;
        
    }
}