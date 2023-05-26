class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length < 1 && nums.length > 10000) return null;
        
        int[] sqrt = new int[nums.length];
        
        //TEST 1: [-4,-1,0,3,10]
        
        int negativesCount = 0;
        
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] < 0) {
                negativesCount++;
            }
            sqrt[i] = (int)Math.pow(nums[i],2); //[16,1,0,9,100]
        }
        
        if (negativesCount == 0) { return sqrt;} 
        int[] sorted = new int[nums.length];
        
        int[] negatives = new int[negativesCount]; //Negatives Ordered by Increasingly
        for(int i = 0; i<negativesCount; i++) {
            negatives[i] = sqrt[(negativesCount-1)-i]; //[1,16]
        }
        
        int positivesCount = nums.length-negativesCount;
        if (positivesCount == 0) { return negatives;} 
        
        int[] positives = new int[positivesCount]; // Positives Ordered by Increasingly
        for(int i = 0; i<positivesCount; i++) {
            positives[i] = sqrt[negativesCount+i];//[0,9,100]
        }
        
        int k = 0; //positivesIndex
        int j = 0; //negativesIndex
        
        for (int i = 0; i<nums.length;i++) {
            if (k < positivesCount) {
                if (j < negativesCount) {
                    if (positives[k] < negatives[j]) {
                        sorted[i] = positives[k++];
                    } else {
                        sorted[i] = negatives[j++];
                    }
                } else {
                    sorted[i] = positives[k++];
                }
            } else {
                sorted[i] = negatives[j++];
            }
        }
        
        
        return sorted;
        
    }
}