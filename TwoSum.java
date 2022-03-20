class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i = 0; i<nums[i]; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[i,map.get(target-nums[i])];
            }
        }
    }
}