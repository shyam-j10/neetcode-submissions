class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
        for(int i = 0;i < n; i++) {
            int diff = target - nums[i];
            if(hMap.containsKey(diff)) {
                return new int[]{hMap.get(diff),i};
            }
            hMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
