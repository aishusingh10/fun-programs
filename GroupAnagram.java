import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> anagramList = new ArrayList<List<String>>();
        //anagramList = groupAnagrams(strs);
        anagramList = groupAnagramsShort(strs);
    }

    public static List<List<String>> groupAnagramsShort(String[] strs) {
        HashMap<String, ArrayList<String>> anagramMap = new HashMap<String, ArrayList<String>>();
        List<List<String>> anagramList = new ArrayList<List<String>>();


        for(String str: strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);
            if(anagramMap.containsKey(sortedStr)) {
                ArrayList<String> valueList = anagramMap.get(sortedStr);
                valueList.add(str);
                anagramMap.put(sortedStr,valueList);
            } else {
                ArrayList<String> valueList = new ArrayList<String>();
                valueList.add(str);
                anagramMap.put(sortedStr, valueList);
            }

        }

        for(List<String> list: anagramMap.values()) {
            System.out.println(list.toString());
            anagramList.add(list);
        }

        return anagramList;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> anagramList = new ArrayList<List<String>>();
        Set<Integer> indexList = new HashSet<Integer>();

        for (int i = 0; i < strs.length; i++) {
            List<String> anagramListItem = new ArrayList<String>();
            anagramListItem.add(strs[i]);
            if (indexList.contains(i)) {
                continue;
            } else {
                for (int j = i + 1; j < strs.length; j++) {
                    boolean flag = isAnagram(strs[i], strs[j]);
                    if (flag) {
                        anagramListItem.add(strs[j]);
                        indexList.add(j);
                    }
                }
                anagramList.add(anagramListItem);
            }
        }

        return anagramList;
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {
            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);
            str1 = String.copyValueOf(strArr1);
            str2 = String.copyValueOf(strArr2);
            if (str1.equals(str2)) {
                return true;
            } else {
                return false;
            }
        }

        return false;

    }

}
