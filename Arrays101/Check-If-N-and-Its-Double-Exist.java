class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr.length < 2 || arr.length > 500) return false;

        /*
        i != j
        0 <= i, j < arr.length
        arr[i] == 2 * arr[j]
        */
        
        for (int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j>=0; j--) {
                if (i == j) continue;
                if(arr[i] == arr[j] * 2) {
                    return true;
                }
            }
        }
        
        
        
        return false;
    }
}