class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length < 2 || nums.length > 5000) return nums;
        
        /*TEST 1: [3,1,2,4]
                  [2,4,1]
                  [1,2,4,3]
                  [2,4,3,1]
        */
        
        for (int i = 0, k = 0; i<nums.length; i++) {
            if (nums[i] % 2 == 0) {
               if (k != i) {
                   int tmp = nums[k];
                   nums[k++] = nums[i];
                   nums[i] = tmp;
               } else {
                   k++;
               }
            } 
        }
        return nums;
    }
}