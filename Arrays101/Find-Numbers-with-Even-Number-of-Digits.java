class Solution {
    public int findNumbers(int[] nums) {
        if (nums.length < 1 && nums.length > 500) return 0;
        
        int counter = 0;
        
        for (int i = 0;i < nums.length; i++) {
            if ((nums[i] / 100000) > 0) {
                counter++;
            } else if ((nums[i] / 10000) > 0) {
                continue; 
            } else if ((nums[i] / 1000) > 0) {
                counter++;
            } else if ((nums[i] / 100) > 0) {
                continue;
            } else if ((nums[i] / 10) > 0) {
                counter++;
            } 
        }
                       
        return counter;
        
    }
}