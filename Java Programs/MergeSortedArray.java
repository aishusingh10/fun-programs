import java.util.*;

public class MergeSortedArray {

    public static void main(String[] args) throws Exception {

        int[] num1 = {1,4,8,0,0,0,0};
        int[] num2 = {2,3,5,11};

        merge(num1, 3, num2, 4);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n==0)
        return;

        int i = 0;
        int j = 0;

        while(i<nums1.length && j<n) {
            if(nums1[i]==0 && i>=m) {
                nums1[i] = nums2[j];
                i++;
                j++;
            } else {
                if(nums1[i]<=nums2[j]) {
                    i++;
                } else {
                    int temp = nums2[j];
                    nums2[j] = nums1[i];
                    nums1[i] = temp;

                    for(int k=0; k<n-1; k++) {
                        if(nums2[k]>nums2[k+1]) {
                            int temp1 = nums2[k];
                            nums2[k] = nums2[k+1];
                            nums2[k+1] = temp1;
                        } else {
                            break;
                        }
                    }
                    i++;
                }
            }
        }

        for(int item: nums1) {
        System.out.println(item);
        }
    
    }

}
