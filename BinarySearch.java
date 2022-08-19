import java.util.*;

public class BinarySearch {

    public static void main(String args[]) {
        int searchKey = 32;
        int[] arr = {1,3,4,2,9,7,32,10,11,23};
        //1,2,3,4,7,9,10,11,23,32
        //0,1,2,3,4,5, 6, 7, 8, 9
        Arrays.sort(arr);

        int index = binarySearch(arr, 0, arr.length-1, searchKey);

        if(index == -1) {
            System.out.println(searchKey +" is not found in the array ");
        } else {
            System.out.println(searchKey +" is found at following position: "+ index);
        }

    }

    public static int binarySearch(int[] arr, int start, int end, int searchKey) {
        int mid = start + (end-start)/2;
        System.out.println("start: " + start + " mid: " + mid + " mid-element: " + arr[mid] + " end: " + end);
        if(arr[mid]==searchKey) {
            System.out.println("found it!");
        return mid;
        }

        if(searchKey>arr[mid]) {
            return binarySearch(arr, mid+1, end, searchKey);
        } else if(searchKey<arr[mid]) {
            return binarySearch(arr, start, mid-1, searchKey);
        } else {
            return -1;
        }
    }
    
}
