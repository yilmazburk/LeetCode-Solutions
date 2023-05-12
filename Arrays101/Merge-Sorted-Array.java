class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != m + n) return;
        if (nums2.length != n) return;
        if (m < 0 || m > 200) return;
        if (n < 0 || n > 200) return;
        if (m+n < 1 || m+n > 200) return;
        if (n == 0) return;
        
        int k = 0; // nums1 index
        int j = 0; // nums2 index
        
        int[] copy = new int[m+n];
        
        for (int i = 0; i<m+n; i++) {
            
            if (k >= m) {
                copy[i] = nums2[j];
                j++;
                continue;
            }  
            
            if (j >= n) {
                copy[i] = nums1[k];
                k++;
                continue;
            }
            
            if (nums1[k] < nums2[j]) {
                copy[i] = nums1[k];
                k++;
            } else {
                copy[i] = nums2[j];
                j++;
            }
        }
        
        /*
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        */
        for (int i = 0; i<m+n; i++) {
            nums1[i] = copy[i];
        }
        
        
    }
}