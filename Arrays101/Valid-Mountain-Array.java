class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr.length > 10000) return false;
        
        boolean peak = false;
        boolean leftSide = false;
        
        //TEST 1: [2,1,0]
        //TEST 2: [3,5,5]
        //TEST 3: [0,3,2,1]
        //TEST 4: [1,2,3]
        //TEST 5: [1,3,2]
        
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
            
            if (!peak) {
                if (arr[i] > arr[i+1]){
                    peak = true;
                } else {
                    leftSide = true;
                }
            } else {
                if (arr[i] <= arr[i+1]) {
                    return false;
                }
            }
        }
        
        return peak && leftSide;
        
    }
}