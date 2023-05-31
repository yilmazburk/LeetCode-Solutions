class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length < 1 || digits.length > 100) return digits;
        
        //TEST 1: [1,2,3]
        //TEST 2: [4,2,9]
        //TEST 3: [9]
        
        int remaining = 0;
        if (digits[digits.length-1] == 9) {
            remaining = 1;
            digits[digits.length-1] = 0;
        } else {
            remaining = 0;
            digits[digits.length-1]++;
        }
        
        if (remaining == 0) return digits;
        
        for(int i = digits.length-2; i>=0; i--) {
            if (remaining == 1) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    remaining = 0;
                }
            } else {
                break;
            }
        }
        
        if (remaining == 1) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            for (int i = 0;i<digits.length;i++) {
                newArray[i+1] = digits[i];
            }
            return newArray;
        } else {  
            return digits;
        }
        
    }
}