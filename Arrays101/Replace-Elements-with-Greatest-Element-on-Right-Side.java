class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length < 1 || arr.length > 10000) return arr;
        
        //TEST 1: Input: arr = [17,18,5,4,6,1]
        //        Output: [18,6,6,6,1,-1]
        
        //TEST 2: [1,2] -> [2,-1]
        
        //TEST 3: [400] -> [-1] 
        
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        
        for (int i = arr.length-2;i>=0;i--) {
            if (arr[i] > max) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            } else {
                arr[i] = max;
            }
        }
             
        return arr;
    }
}