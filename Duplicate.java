import java.util.*;

class Duplicate {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = { 1, 1, 1, 2, 2, 3, 5 };
        boolean result = containsDuplicate(nums);

        System.out.println(result);

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean isDuplicate = false;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                isDuplicate = true;
                break;
            } else {
               map.put(nums[i], 1); 
            }
        }
        
        return isDuplicate;
        
    }
}