import java.util.*;

public class PatternMatchingNewApproach {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] words = { "memee", "abcdd", "ababb", "eehfgss", "kekee", "weeds" };
        String pattern = "fefee";

        int[] numPattern = generateNumPattern(pattern);

        for (String word : words) {
            if (pattern.length() != word.length()) {
                continue;
            } else {
                int[] wordPattern = generateNumPattern(word);
                if (Arrays.toString(wordPattern).equals(Arrays.toString(numPattern))) {
                    System.out.println(word);
                }
            }
        }

    }

    public static int[] generateNumPattern(String pattern) {
        int counter = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int[] numPattern = new int[pattern.length()];
        numPattern[0] = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                numPattern[i] = map.get(pattern.charAt(i));
            } else {
                counter++;
                numPattern[i] = counter;
                map.put(pattern.charAt(i),counter);
            }
        }
        return numPattern;
    }
}
