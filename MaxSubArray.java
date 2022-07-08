class MaxSubArray {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = {-2,-1};
        int result = maxSubArray(nums);

        System.out.println(result);

    }

    public static int maxSubArray(int[] nums) {
        int localSum = 0;
        int globalSum = nums[0];
        
        if(nums.length == 1)
            return nums[0];
    
        
        for(int i=0;i<=nums.length-1;i++) {
            if(localSum<0) {
                localSum = 0;
            } 
            localSum = localSum + nums[i];
            globalSum = localSum>globalSum? localSum: globalSum;
            System.out.println("localSum: " +localSum+ " totalSum: " + globalSum);
        }
        
        return globalSum;
        
    }
}