class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length < 1 || nums.length > 100000) return null;
        
        List<Integer> dissappearList = new ArrayList<Integer>(nums.length);
        
        //TEST 1: [4,3,2,7,8,2,3,1]
        //TEST 2: [1,1]
        
        for (int i = 1; i<=nums.length; i++) {
            dissappearList.add(i);
        }
        
        for (int i = 0; i<nums.length; i++) {
            dissappearList.set(nums[i]-1, null);
        }
        
        int k = 0;
        for (Integer dissappear : dissappearList) {
            if (dissappear != null) {
                dissappearList.set(k++, dissappear);
            }
        }
        
        return dissappearList.subList(0, k);
    }
}