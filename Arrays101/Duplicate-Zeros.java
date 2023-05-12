class Solution {
    public void duplicateZeros(int[] arr) {
        if (arr.length < 1 || arr.length > 10000) return;
        int zeroCounter = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 0){
                zeroCounter++;
            }
        }
        
        if (zeroCounter == 0) { return; }
        
        int[] newArr = new int[arr.length + zeroCounter];
        
        for (int i = 0, k = 0; i<arr.length; i++, k++) {
            if (arr[i] == 0){
                newArr[k++] = arr[i];
                newArr[k] = arr[i];    
            } else {
                newArr[k] = arr[i];
            }
        }
        
        for (int i = 0; i<arr.length; i++) {
            arr[i] = newArr[i];
        }
        
            
        
        /*
        Input: arr = [1,0,2,3,0,4,0,0]
        Output: [1,0,0,2,3,0,0,4]
        */
        
        /*for(int i = 0;i<arr.length-1; i++) {
            if (arr[i] == 0){
                for(int j = arr.length-2; j>=i+1; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            } 
        */
        
        
    }
}