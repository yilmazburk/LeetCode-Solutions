class Solution {
    public int heightChecker(int[] heights) {
        if (heights.length < 1 || heights.length > 100) return 0;
        
        
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int k = 0;
        for (int i = 0;i<heights.length;i++) {
            if (heights[i] != expected[i]) {
                k++;
            }
        }
        
        return k;
        
        /*
            TEST 1: [1,1,4,2,1,3]
            TEST 2: [5,1,2,3,4]
            TEST 3: [1,2,3,4,5]
            TEST 4: [3,4,2]
        
        */
        /*
        int counter = 0;
        for (int k = 0; k<heights.length; k++) {
            int tmp = counter;
            for (int i = k-1;i>=0;i--) {
                if(heights[k] < heights[i]) {
                    counter++;
                    break;
                }
            }
            if (tmp == counter) {
                for (int i = k+1; i < heights.length; i++) {
                    if (heights[k] > heights[i]) {
                        counter++;
                        break;
                    }
                }
            }
        }
        
        return counter;*/
    }
}