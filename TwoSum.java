import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] pos = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        
        return pos;
    }
}