class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(freq.containsKey(num)){
                return true;
            }
            freq.put(num,1);
        }
        return false;
    }
}