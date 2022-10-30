import java.util.*;
import java.util.stream.Collectors;

class TopK {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int[] arr = topKFrequent(nums, 2);

        for(int item: arr) {
            System.out.println(item);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        int[] topK = new int[k];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(sortedMap.toString());

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (k > 0) {
                topK[j] = entry.getKey();
                k--;
                j++;
            } else {
                break;
            }
        }
        return topK;

    }
}