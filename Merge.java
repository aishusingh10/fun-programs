import java.util.Stack;

public class Merge {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int l=0;
        int r=2;
        int x=2;
        binarySearch(arr,0,2,2);
    }

    public static void binarySearch(int[] arr, int l, int r, int x) {
       int n = 100;
       Stack<Boolean> stack = new Stack<Boolean>();

       while(n>0) {

        stack.push(n%2==0);

        n=n/2;
       }

       while(!stack.isEmpty()) {
        System.out.println(stack.pop());
       }
    }
    
}
