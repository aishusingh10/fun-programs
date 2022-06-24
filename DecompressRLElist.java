import java.util.ArrayList;
import java.util.List;

class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        List<List<Integer>> items = new ArrayList<List<Integer>>();
        for(int i=0;2*i+1 < nums.length;i++) {
            int freq, val = 0;
             freq = nums[2*i];
             val = nums[2*i+1];
            List<Integer> item = new ArrayList<Integer>();
            len = len + freq;
            for(int k=0;k<freq;k++){
                item.add(val);
            }
            items.add(item);
        }
                                           
        int[] arr = new int[len];
        int i = 0;
        for(List<Integer> item: items){
            for(int num: item) {
                arr[i] = num;
                i++;
            }
        }
        
        return arr;
    }
}