class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length < 1 && nums.length > 10000) return null;
        
        int[] sqrt = new int[nums.length];
        int[] sorted = new int[nums.length];
        int negativesCount = 0;
        
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] < 0) {
                negativesCount++;
            }
            sqrt[i] = (int)Math.pow(nums[i],2);
        }
        
        if (negativesCount <= 0) { return sqrt;} 
        
        
        int[] negatives = new int[negativesCount]; //Negatives Ordered by Increasingly
        for(int i = 0; i<negativesCount; i++) {
            negatives[i] = sqrt[(negativesCount-1)-i];
        }
        
        int positivesCount = nums.length-negativesCount;
        int[] positives = new int[positivesCount]; // Positives Ordered by Increasingly
        for(int i = 0; i<positivesCount; i++) {
            positives[i] = sqrt[negativesCount+i];
        }
        
        int k = 0; //positivesIndex
        int m = 0; //Sorted Index
        
        for(int i = 0; i < negativesCount; i++) {
            
            for (int j = k; j<positivesCount; j++) {
                if (negatives[i] > positives[j]) {
                    sorted[m] = positives[k];
                    k++;
                    m++;
                } else {
                    break;
                }
            }
            
            sorted[m] = negatives[i];
            m++;
        }
        
        if (k < positivesCount) {
            for (int i = k;i<positivesCount; i++) {
                sorted[m] = positives[i];
                m++;
            }
        }
        
        
        return sorted;
        
    }
}