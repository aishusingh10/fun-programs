import java.util.Arrays;

public class FindSmallestValue {

    public static void main(String[] args) {

        int[] arr = {0,2,3,4,5};
        Arrays.sort(arr);

        int smallestValue = 0;

        for(int i=0; i<arr.length; i++ ) {
            if(arr[i]!=i+1) {
              smallestValue = arr[i]+1;
              break;
            }
        }

        System.out.println(smallestValue);

    }
    
}
