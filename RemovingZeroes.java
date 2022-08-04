public class RemovingZeroes {

    public static void main(String args[]) {
        int[] arr = { 1, 2, 0, 0, 4, 0, 3, 0 };

        arr = removeZeroes(arr);

        for(int element: arr) {
        System.out.println(element);
        }
    }

    public static int[] removeZeroes(int[] arr) {

        int k = 0;

        try {
      
        for(int i=0; i < arr.length; i++) {
            if(arr[i]==0) {
                int j = i;
                while(arr[j]==0) {
                  j++;
                }
                arr[i] = arr[j];
                arr[j] = 0;
            } 
        }
    } catch(Exception e) {
        System.out.println(e.getStackTrace());
    }

    return arr;

 }

}
