import java.util.*;

class StreamAverage {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Integer[] nums = {-1,2,3,4,5,2,-2,3};
        List<Integer> arrList = Arrays.asList(nums);
        double result = maxSubArray(arrList);

        System.out.println(result);

    }

    public static double maxSubArray(List<Integer> arrList) {
        
        return arrList.stream().mapToInt(x->x).average().getAsDouble();
        
    }
}